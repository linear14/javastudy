package ch08_interface.ex3_1;

import ch08_interface.ex2.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
		rc1.setVolume(10);
		rc2.setVolume(200);
	}

}
