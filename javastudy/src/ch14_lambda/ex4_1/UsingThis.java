package ch14_lambda.ex4_1;

public class UsingThis {
	
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField);
				System.out.println();
				
				// 람다식 내의 this는 람다식을 호출한 객체 (여기서는 Inner)
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField);
			};
			
			fi.method();
		}
	}
}
