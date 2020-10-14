package ch09_nested_objects.ex4;

public class Button {
	private OnClickListener li;
	
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
