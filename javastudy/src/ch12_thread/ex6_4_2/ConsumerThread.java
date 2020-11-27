package ch12_thread.ex6_4_2;

public class ConsumerThread extends Thread {

	private DataBox db;
	
	public ConsumerThread(DataBox db) {
		this.db = db;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			String data = db.getData();
		}
	}
}
