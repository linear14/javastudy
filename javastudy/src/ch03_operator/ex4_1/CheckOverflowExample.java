package ch03_operator.ex4_1;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("Overflow");
			}
		} else {
			if(left < Integer.MIN_VALUE - right) {
				throw new ArithmeticException("Overflow");
			}
		}
		return left + right;
	}

}
