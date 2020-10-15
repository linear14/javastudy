package ch09_nested_objects.ex5_2;

public class Button {
	OnClickListener li;
	
	void setOnClickListener(OnClickListener li) {
		this.li = li;
	}
	
	void touch() {
		li.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
