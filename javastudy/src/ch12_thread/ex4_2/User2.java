package ch12_thread.ex4_2;

public class User2 extends Thread {
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.cal = cal;
		this.setName("User2 Thread");
	}
	
	@Override
	public void run() {
		cal.setMemory(50);
	}
}
