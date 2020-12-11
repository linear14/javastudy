package ch12_thread.ex9_3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				System.out.println(Thread.currentThread().getName() + "에서 작업이 시작됨");
				int sum = 0;
				for(int i = 1; i <= 100000; i++) {
					sum += i;
				}
				System.out.println(Thread.currentThread().getName() + "에서 작업이 완료됨");
				return sum;
			}
		};
		
		Future<Integer> future = service.submit(callable);
		
		try {
			System.out.println("[지연 시작]");
			int sum = future.get();	// 지연 완료 (pending completion) .. 아래 코드는 처리가 완료된 뒤 실행 (당연한듯 보이지만.. 계산 수행은 다른 스레드에서 진행중임을 인지하자)
			
			System.out.println("[처리 결과] " + sum);
			System.out.println("[작업 처리 완료]");
		} catch(Exception e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		service.shutdown();
	}

}
