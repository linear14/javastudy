package ch11_apis.ex3_3;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj1 = myPhone.toString();
		System.out.println(strObj1);
		System.out.println(myPhone);
				

	}

}
