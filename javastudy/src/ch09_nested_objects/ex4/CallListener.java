package ch09_nested_objects.ex4;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
