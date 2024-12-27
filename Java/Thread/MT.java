import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MT {
    int val;

    Semaphore lock2;

    Lock lock;

    MT() {
        val = 0;
        lock = new ReentrantLock();
        lock2 = new Semaphore(4);
    }

    public static void main(String[] args) throws InterruptedException {
        MT mt = new MT();

        // AtomicInteger automatically works by obtaining lock
        AtomicInteger at = new AtomicInteger(10);
        System.out.println(at.incrementAndGet());

        Thread[] threads = new Thread[100];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(mt::increment);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println(mt.val);
    }

    public void increment() {
        if (lock2.tryAcquire()) {
            try {
                Thread.sleep(100);
                val++;
            } catch (Exception e) {}
            lock2.release();
        } else {
            System.out.println("Couldn't update the value");
        }

        // if (lock.tryLock()) {
        //     try {
        //         Thread.sleep(100);
        //         val++;
        //     } catch (Exception e) {}
        //     lock.unlock();
        // } else {
        //     System.out.println("Couldn't update the value");
        // }
    }
}
