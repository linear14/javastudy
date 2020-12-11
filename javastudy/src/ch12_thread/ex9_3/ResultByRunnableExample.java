package ch12_thread.ex9_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		Future<Result> future1 = service.submit(task1, result);	// new Result() 로 해도 되네? .. 2번째 인자로는 반환 타입만 명시해주면 되는듯
		Future<Result> future2 = service.submit(task2, result);
		
		try {
			future1.get(); // result = future1.get()
			future2.get(); // result = future2.get()
			System.out.println("[처리 결과] " + result.accumValue);
			System.out.println("[작업 처리 완료]");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		service.shutdown();
	}
}

class Task implements Runnable {
	Result result;
	
	Task(Result result) {
		this.result = result;
	}

	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		result.addValue(sum);
	}
	
}

class Result {
	int accumValue;
	
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
