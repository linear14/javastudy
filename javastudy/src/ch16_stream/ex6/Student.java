package ch16_stream.ex6;

public class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student arg0) {
		return Integer.compare(score, arg0.score);
	}

}
