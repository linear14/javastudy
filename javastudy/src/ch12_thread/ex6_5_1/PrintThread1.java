package ch12_thread.ex6_5_1;

public class PrintThread1 extends Thread {
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("���� ��");
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
