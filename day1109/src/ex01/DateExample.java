package ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		
		String strNow1 = now.toString();
		System.out.println("오늘날짜:" + strNow1);
		
		SimpleDateFormat sf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초 D일째 F주차");
		
		//Date 타입의 날짜를 원하는 패턴으로 변경
		String strNow2 = sf.format(now);
		System.out.println("변경 날짜:" + strNow2);
		
	}
}

