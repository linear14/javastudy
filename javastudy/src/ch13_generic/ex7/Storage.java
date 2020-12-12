package ch13_generic.ex7;

public interface Storage<T> {

	public void add(T item, int index);
	
	public T get(int index);
}
