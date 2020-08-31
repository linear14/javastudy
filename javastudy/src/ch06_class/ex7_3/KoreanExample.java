package ch06_class.ex7_3;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("이동동", "950121-1234567");
		Korean k2 = new Korean("박동동", "941030-7654321");
		
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}

}
