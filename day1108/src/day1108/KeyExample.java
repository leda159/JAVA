package day1108;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {

		//Map 구조의 특징
		//1.Key와 Value 값으로 구성
		//2.Key는 중복을 허용안되고 Value는 중복허용
		//3.입력 순서는 보장된다.
		//4.HashMap은 대량의 데이터 검색시 유리
		HashMap<Key,String> hashMap = 
				    new HashMap<Key,String>();
		
		//Map 구조에 추가를 하는 메서드
		hashMap.put(new Key(1),"홍길동");
		
		//get은 특정 위치에 있는 값을 가져온다.
		//put 했을때 주소값과 get했을때 key의 주소값 다름
		//(new 연산자를 사용)
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}

}
