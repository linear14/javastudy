package ch12_thread.ex6_5_2;

public class InterruptExample {

	public static void main(String[] args) {
		// Thread thread = new PrintThread1();
		Thread thread = new PrintThread2();
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		thread.interrupt();

	}

}
