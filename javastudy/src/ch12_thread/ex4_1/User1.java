package ch12_thread.ex4_1;

public class User1 extends Thread {
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.cal = cal;
		this.setName("User1 Thread");
	}
	
	@Override
	public void run() {
		cal.setMemory(100);
	}
}
