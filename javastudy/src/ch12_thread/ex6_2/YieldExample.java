package ch12_thread.ex6_2;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		jobSleep();
		threadA.work = false;
		
		jobSleep();
		threadA.work = true;
		
		jobSleep();
		threadA.stop = true;
		threadB.stop = true;
			
	}
	
	private static void jobSleep() {
		try {
			Thread.sleep(2000);
		} catch(Exception e) {}
	}

}
