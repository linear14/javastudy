package ch08_interface.ex2;

// �⺻������ ���� public
public interface RemoteControl {
	// ���
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ �޼ҵ� (default�� ���� �����ڰ� �ƴմϴ�)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
