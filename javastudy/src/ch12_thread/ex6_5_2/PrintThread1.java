package ch12_thread.ex6_5_2;

public class PrintThread1 extends Thread {

	public void run() {
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(5);
			}
		} catch(InterruptedException e) {}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
