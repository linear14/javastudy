package ch05_reference_type.ex6_7;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		
		printScores(mathScores, "Math");
		printScores(englishScores, "English");
		printScores(javaScores, "Java");

	}
	
	public static void printScores(int[][] scores, String subject) {
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.println(subject + "Scores[" + i + "][" + j + "]=" + scores[i][j]);
			}
		}
		
		System.out.println();
	}

}
