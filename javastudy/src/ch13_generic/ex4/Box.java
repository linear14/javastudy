package ch13_generic.ex4;

public class Box<T> {

	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}

}
