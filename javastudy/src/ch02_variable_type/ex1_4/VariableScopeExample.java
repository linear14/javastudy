package ch02_variable_type.ex1_4;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		// 아래 구문은 컴파일에러
		// int v3 = v1 + v2 + 5
	}

}
