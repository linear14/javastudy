package ch05_reference_type.ex6_9;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int item : newIntArray) {
			System.out.println(item);
		}
	}

}
