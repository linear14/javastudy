package ch12_thread.ex7;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread thread = new AutoSaveThread();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(4000);
		} catch(Exception e) {}

		System.out.println("메인 스레드 종료");
	}

}
