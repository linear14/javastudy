package ch12_thread.ex6_2;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadB ����");
	}
}