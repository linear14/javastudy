package ch11_apis.ex5_3;

public class SystemTimeExample {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int sum = 0;
		for(int i = 1; i <= 10001000; i++) {
			sum += i;
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("로직이 수행되는데 걸린 시간 : " + (endTime - startTime) + " 밀리세컨드");

	}

}
