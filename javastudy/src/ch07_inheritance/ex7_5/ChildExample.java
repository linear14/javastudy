package ch07_inheritance.ex7_5;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// Child child1 = (Child) new Parent();
		
		Child child2 = (Child) parent;
		child2.field2 = "yyy";
		child2.method3();
	}

}
