package ch05_reference_type.ex6_3;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println(sum);
	}

}
