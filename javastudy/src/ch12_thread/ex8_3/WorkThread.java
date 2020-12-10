package ch12_thread.ex8_3;

public class WorkThread extends Thread {
	
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Thread(" + getName() + ") interrupted");
				break;
			}
		}
		System.out.println("Thread(" + getName() + ")" + " Á¾·áµÊ");
	}
}
