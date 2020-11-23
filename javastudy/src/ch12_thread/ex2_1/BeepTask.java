package ch12_thread.ex2_1;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("Thread-beep");
			
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
