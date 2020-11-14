package ch11_apis.ex7_2;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요";
		
		// 인코딩 (디폴트 문자셋으로 변환)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
	
		// 디코딩
		String str1 = new String(bytes1);
		System.out.println("bytes1-> String: " + str1);
		
		
		// 인코딩 (EUC-KR 한글 2바이트로 변환)
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("bytes2.length: " + bytes2.length);
	
		// 디코딩
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("bytes2-> String: " + str2);
		
		
		// 인코딩 (UTF-8 한글 3바이트로 변환)
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("bytes3.length: " + bytes3.length);
	
		// 디코딩
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("bytes3-> String: " + str3);
	}

}
