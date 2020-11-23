package ch12_thread.ex2_1;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// ��� 1
		Runnable beepTask = new BeepTask();
		Thread thread1 = new Thread(beepTask);
		
		// ���2
		Thread thread2 = new Thread(new Runnable() {
			@Override
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
		});
		
		// ���3
		Thread thread3 = new Thread(() -> {
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
		});
		
		thread3.start();
		
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
