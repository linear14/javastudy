package ch12_thread.ex6_5_2;

public class PrintThread2 extends Thread {
	
	public void run() {
		while(true) {
			System.out.println("���� ��");
			
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
