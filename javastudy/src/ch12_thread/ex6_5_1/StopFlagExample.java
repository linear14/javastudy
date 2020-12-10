package ch12_thread.ex6_5_1;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 thread = new PrintThread1();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		thread.setStop(true);

	}

}
