package ch11_apis.ex7_2;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "�ȳ��ϼ���";
		
		// ���ڵ� (����Ʈ ���ڼ����� ��ȯ)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
	
		// ���ڵ�
		String str1 = new String(bytes1);
		System.out.println("bytes1-> String: " + str1);
		
		
		// ���ڵ� (EUC-KR �ѱ� 2����Ʈ�� ��ȯ)
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("bytes2.length: " + bytes2.length);
	
		// ���ڵ�
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("bytes2-> String: " + str2);
		
		
		// ���ڵ� (UTF-8 �ѱ� 3����Ʈ�� ��ȯ)
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("bytes3.length: " + bytes3.length);
	
		// ���ڵ�
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("bytes3-> String: " + str3);
	}

}
