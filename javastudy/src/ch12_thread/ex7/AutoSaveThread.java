package ch12_thread.ex7;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("�۾� ������ �ڵ� �����մϴ�.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				break;
			}
			save();
		}
		
		// �������� �ʳ�
		System.out.println("���� ������ ����");
	}

}
