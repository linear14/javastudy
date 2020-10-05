package ch08_interface.ex4_2;

import ch08_interface.ex2.RemoteControl;
import ch08_interface.ex3_1.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		RemoteControl.changeBattery();
	}

}
