package ch12_thread.ex6_3;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch(Exception e) {}
		
		System.out.println("1~200 гу : " + sumThread.getSum());

	}

}
