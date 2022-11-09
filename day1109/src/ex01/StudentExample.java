package ex01;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		
		//제네릭 안에 Key,Value로 구성되어 있다.
		//HashMap은 순서가 보장이 된다. = > get 메서드 존재한다.
		HashMap<Student, String> hashMap = 
				new HashMap<Student, String>();
		
		//HashMap에 추가를 한다.
		hashMap.put(new Student("1"),"95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점:" + score);

	}

}
