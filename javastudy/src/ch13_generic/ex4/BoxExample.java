package ch13_generic.ex4;

public class BoxExample {

	public static void main(String[] args) {
		
		Box<String> box = Util.<String>boxing("µ¿Çö");
		String value = box.get();
		
		Box<Integer> box2 = Util.boxing(3);
		int value2 = box2.get();
		
		System.out.println(value);
		System.out.println(value2);
	}

}
