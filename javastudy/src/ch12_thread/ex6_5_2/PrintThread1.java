package ch12_thread.ex6_5_2;

public class PrintThread1 extends Thread {

	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(5);
			}
		} catch(InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
