package ch12_thread.ex9_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾� ó�� ��û]");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <= 100000; i++) {
					sum += i;
				}
				System.out.println("[ó�� ���] " + sum);
			}
		};
		
		Future future = service.submit(runnable);
		
		try {
			System.out.println("[���� ����]");
			future.get();	// ���� �Ϸ� (pending completion) .. �Ʒ� �ڵ�� ó���� �Ϸ�� �� ����
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch(Exception e) {
			System.out.println("[���� ���� �߻���] " + e.getMessage());
		}
		
		service.shutdown();
	}

}
