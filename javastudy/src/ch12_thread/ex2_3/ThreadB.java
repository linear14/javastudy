package ch12_thread.ex2_3;

public class ThreadB extends Thread {
	
	public ThreadB() {
		setName("Thread-B");
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
