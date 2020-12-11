package ch12_thread.ex9_3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾� ó�� ��û]");
		
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				System.out.println(Thread.currentThread().getName() + "���� �۾��� ���۵�");
				int sum = 0;
				for(int i = 1; i <= 100000; i++) {
					sum += i;
				}
				System.out.println(Thread.currentThread().getName() + "���� �۾��� �Ϸ��");
				return sum;
			}
		};
		
		Future<Integer> future = service.submit(callable);
		
		try {
			System.out.println("[���� ����]");
			int sum = future.get();	// ���� �Ϸ� (pending completion) .. �Ʒ� �ڵ�� ó���� �Ϸ�� �� ���� (�翬�ѵ� ��������.. ��� ������ �ٸ� �����忡�� ���������� ��������)
			
			System.out.println("[ó�� ���] " + sum);
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch(Exception e) {
			System.out.println("[���� ���� �߻���] " + e.getMessage());
		}
		
		service.shutdown();
	}

}
