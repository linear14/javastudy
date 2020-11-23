package ch12_thread.ex2_3;

public class ThreadA extends Thread {

	public ThreadA() {
		setName("Thread-A");
	}
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
