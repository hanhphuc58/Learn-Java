package Bai_9_2;

public class SynchronizedClass implements Runnable {

	private int count;

	public SynchronizedClass(int count) {
		this.count = count;
	}

	public synchronized void Decrease() {

		count++;

		System.out.println(count);
	}

	@Override
	public void run() {
		Decrease();
	}

	public static void main(String[] args) {
		SynchronizedClass sc = new SynchronizedClass(1);

		Thread th1 = new Thread(sc);
		Thread th2 = new Thread(sc);
		
		th1.start();
		th2.start();
	}
}
