package ch12_thread.ex9_4;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	
	private ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
	
	private CompletionHandler<Integer, Void> callback = 
			new CompletionHandler<Integer, Void>() {

				@Override
				public void completed(Integer result, Void arg1) {
					System.out.println("completed() ½ÇÇà: " + result);
				}

				@Override
				public void failed(Throwable exception, Void arg1) {
					System.out.println("failed() ½ÇÇà: " + exception.toString());
				}
			};
			
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch(Exception e) {
					callback.failed(e, null);
				}
			}
		};
		executorService.submit(task);
	}
	
	public void finish() {
		executorService.shutdown();
	}

	public static void main(String[] args) {
		CallbackExample ex = new CallbackExample();
		ex.doWork("3", "4");
		ex.doWork("3", "»ï");
		ex.finish();

	}

}
