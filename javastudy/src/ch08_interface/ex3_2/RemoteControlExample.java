package ch08_interface.ex3_2;

import ch08_interface.ex2.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("�մϴ�");
			}

			@Override
			public void turnOff() {
				System.out.println("���ϴ�");
				
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("���� �����մϴ�.");
			
			}
			
		};

	}

}
