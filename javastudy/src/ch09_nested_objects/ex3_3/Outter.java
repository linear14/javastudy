package ch09_nested_objects.ex3_3;

public class Outter {
	public void method(int arg, final int arg2) {
		int localVariable = 1;
		final int localVariable2 = 3;
		
		class Inner {
			int same = localVariable2;
			public void method() {
				int result = arg + localVariable;	
			}
		}
	}
}

// final이 붙은 매개변수 및 지역변수는 내부 로컬 클래스의 메서드 내부에 복사
// 붙지 않은 매개변수 및 지역변수는 내부 클래스의 필드로 복사
