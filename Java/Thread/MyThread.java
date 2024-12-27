public class MyThread extends Thread{
	public Counter counter;
	public int times;

	MyThread(Counter counter) {
		this.counter = counter;
		this.times = 1000000;
	}

	public void run() {
		System.out.println("Thread : " + Thread.currentThread().getName() + " is starting");
		for(int i = 0; i < times; i++) {
			counter.increment();
		}
		System.out.println("Thread : " + Thread.currentThread().getName() + " is completed");
	}
}
