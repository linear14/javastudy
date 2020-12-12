package ch13_generic.ex4;

public class PairExample {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>();
		p1.setKey(1);
		p1.setValue("사과");
		
		Pair<Integer, String> p2 = new Pair<>();
		p2.setKey(2);
		p2.setValue("사과");
		
		Pair<Integer, String> p3 = new Pair<>();
		p3.setKey(2);
		p3.setValue("사과");
		
		boolean result12 = Util.<Integer, String>compare(p1, p2);
		boolean result23 = Util.compare(p2, p3);
		
		System.out.println(result12);
		System.out.println(result23);

	}

}
