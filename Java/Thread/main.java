public class main {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();

        MyThread[] threads = new MyThread[10];

        for(int i = 0 ; i < 10; i++) {
            threads[i] = new MyThread(counter);
            threads[i].start();
        }

        for(int i = 0; i < 10; i++) {
            threads[i].join();
        }

        System.out.println(counter.count);
    }
}