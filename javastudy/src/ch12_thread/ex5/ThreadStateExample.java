package ch12_thread.ex5;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();

	}

}
