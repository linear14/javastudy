package ch05_reference_type.ex6_9;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String item : newStrArray) {
			System.out.println(item);
		}
	}

}
