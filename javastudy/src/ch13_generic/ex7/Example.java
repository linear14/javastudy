package ch13_generic.ex7;

public class Example {
	
	public static void main(String[] args) {
		
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("����ƮTV");
		product.setCompany("�Ｚ");
		
		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}

class Tv {}