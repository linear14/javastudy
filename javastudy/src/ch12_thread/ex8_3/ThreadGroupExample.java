package ch12_thread.ex8_3;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("testGroup");
		
		WorkThread wsA = new WorkThread(tg, "wsA");
		WorkThread wsB = new WorkThread(tg, "wsB");
		
		wsA.start();
		wsB.start();
		
		System.out.println("[ main Thread �׷��� list() �Լ� ��� ��� ]");
		ThreadGroup mg = Thread.currentThread().getThreadGroup();
		mg.list();
		System.out.println();
		
		try { Thread.sleep(3000); } catch(Exception e) {}
		
		System.out.println("[ test Thread �׷��� interrupt() �޼��� ȣ�� ]");
		tg.interrupt();

	}

}
