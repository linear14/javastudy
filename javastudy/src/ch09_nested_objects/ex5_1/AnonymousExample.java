package ch09_nested_objects.ex5_1;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		
		anony.method2(new Person() {
			void study() {
				System.out.println("���θ� �մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});

	}

}
