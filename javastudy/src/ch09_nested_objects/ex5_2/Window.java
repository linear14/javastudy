package ch09_nested_objects.ex5_2;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListener li = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	Window() {
		btn1.setOnClickListener(li);
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
				
			}
		});
	}
}
