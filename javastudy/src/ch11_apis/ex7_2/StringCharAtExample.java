package ch11_apis.ex7_2;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "123456-2234567";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�");
			break;
		}

	}
}
