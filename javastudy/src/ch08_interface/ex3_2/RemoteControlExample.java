package ch08_interface.ex3_2;

import ch08_interface.ex2.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("ÄÕ´Ï´Ù");
			}

			@Override
			public void turnOff() {
				System.out.println("²ü´Ï´Ù");
				
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("º¼·ý Á¶ÀýÇÕ´Ï´Ù.");
			
			}
			
		};

	}

}
