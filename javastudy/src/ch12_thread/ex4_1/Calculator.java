package ch12_thread.ex4_1;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
