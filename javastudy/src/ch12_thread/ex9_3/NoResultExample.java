package ch12_thread.ex9_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <= 100000; i++) {
					sum += i;
				}
				System.out.println("[처리 결과] " + sum);
			}
		};
		
		Future future = service.submit(runnable);
		
		try {
			System.out.println("[지연 시작]");
			future.get();	// 지연 완료 (pending completion) .. 아래 코드는 처리가 완료된 뒤 실행
			System.out.println("[작업 처리 완료]");
		} catch(Exception e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		service.shutdown();
	}

}
