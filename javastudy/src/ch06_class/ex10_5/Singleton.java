package ch06_class.ex10_5;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
