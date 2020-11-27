package ch12_thread.ex6_3;

public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 200; i++) {
			sum += i;
		}
	}
}
