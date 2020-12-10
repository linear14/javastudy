package ch12_thread.ex8_1;

import java.util.Map;
import java.util.Set;

import ch12_thread.ex7.AutoSaveThread;

public class ThreadInfoExample {
	
	public static void main(String[] args) {
		Thread thread = new AutoSaveThread();
		thread.setName("AutoSaveThread");
		thread.setDaemon(true);
		thread.start();
		
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread item: threads) {
			System.out.println("Name: " + item.getName());
			System.out.println("isDaemon: " + ((item.isDaemon())?"Daemon Thread":"Not Daemon Thread"));
			System.out.println("소식그룹: " + item.getThreadGroup().getName());
			System.out.println("\n\n");
		}
	}
}
