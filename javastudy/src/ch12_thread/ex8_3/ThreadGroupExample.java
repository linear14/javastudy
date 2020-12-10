package ch12_thread.ex8_3;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("testGroup");
		
		WorkThread wsA = new WorkThread(tg, "wsA");
		WorkThread wsB = new WorkThread(tg, "wsB");
		
		wsA.start();
		wsB.start();
		
		System.out.println("[ main Thread 그룹의 list() 함수 출력 결과 ]");
		ThreadGroup mg = Thread.currentThread().getThreadGroup();
		mg.list();
		System.out.println();
		
		try { Thread.sleep(3000); } catch(Exception e) {}
		
		System.out.println("[ test Thread 그룹의 interrupt() 메서드 호출 ]");
		tg.interrupt();

	}

}
