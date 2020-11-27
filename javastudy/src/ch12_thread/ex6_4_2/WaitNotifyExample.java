package ch12_thread.ex6_4_2;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox db = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(db);
		ConsumerThread consumerThread = new ConsumerThread(db);
		
		producerThread.start();
		consumerThread.start();
	}

}
