package ch12_thread.ex6_4_1;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		
		try {
			wait();
		} catch(Exception e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		
		try {
			wait();
		} catch(Exception e) {}
	}
}
