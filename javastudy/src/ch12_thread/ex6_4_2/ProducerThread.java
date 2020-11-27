package ch12_thread.ex6_4_2;

public class ProducerThread extends Thread {

	private DataBox db;
	
	public ProducerThread(DataBox db) {
		this.db = db;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			db.setData(data);
		}
	}
}
