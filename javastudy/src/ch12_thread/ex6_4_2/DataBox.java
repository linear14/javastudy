package ch12_thread.ex6_4_2;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch(Exception e) {}
		}
		
		String returnValue = data;
		System.out.println("ConsumerThread�� ���� ������: " + returnValue);
		
		data = null;
		notify();
		
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch(Exception e) {}
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: " + data);
		notify();
	}
}
