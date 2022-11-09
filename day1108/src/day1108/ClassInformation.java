package day1108;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInformation {
	public static void main(String[] args) {

		//인스턴스 생성
		Student c = new Student();
		
		//패키지 명 포함 클래스명 리턴
		System.out.println("Full 클래스명:" +
		            c.getClass().getName());
		
		
		System.out.println("short 클래스명:" +
	            c.getClass().getSimpleName());
		
		System.out.println("=======필드 정보========");
		
		for(Field field : c.getClass().getFields()) {
			System.out.println("필드명:" + field.getName());
		}
		
		System.out.println("=======생성자 정보========");
		
		for(Constructor<?> con : 
			        c.getClass().getConstructors()) {
			System.out.println("생성자명:" + con);
		}

		System.out.println("=======메서드 정보========");
		
		for(Method method : 
			        c.getClass().getDeclaredMethods()) {
			System.out.println(
					"메서드명:" + method.getName());
		}

	}

}




