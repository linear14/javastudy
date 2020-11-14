package ch11_apis.ex7_1;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("ют╥б : ");
		int readBytes = System.in.read(bytes);
		
		String str = new String(bytes, 0, readBytes-2);
		System.out.println(str);

	}

}
