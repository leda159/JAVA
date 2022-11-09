package ex01;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {

		String str = "안녕하세요";
		
		System.out.println("현재 시스템의 인코딩 방식:" +
				System.getProperty("file.encoding"));		
		
		//현재 시스템의 인코딩 방식에 의해 바이트 수 리턴
		byte[] bytes1 = str.getBytes();//15바이트
		System.out.println("bytes1 길이:" + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("byte1 -> String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2 길이:" + bytes2.length);
			
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("byte2 -> String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3 길이:" + bytes3.length);
			
			String str3 = new String(bytes3);
			System.out.println("byte3 -> String: " + str3);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
