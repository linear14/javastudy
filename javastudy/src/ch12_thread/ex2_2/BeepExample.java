package ch12_thread.ex2_2;

import java.awt.Toolkit;

public class BeepExample {

	public static void main(String[] args) {
		// 规过1
		Thread thread1 = new BeepThread();
		
		// 规过2
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					System.out.println("Thread-beep");
					
					try {
						Thread.sleep(500);
					} catch(Exception e) {}
				}
			}
		};
		thread2.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("beep");
			
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}

	}

}
