package day1101;

public class KoreanExample {

	public static void main(String[] args) {
		
		//Korean 인스턴스를 Heap메모리에 생성하고
		//매개변수 2개짜리 생성자 호출
		Korean k1 = new Korean("박자바" , "0101111-1111");
		
		System.out.println("k1.name:" + k1.name);
		System.out.println("k1.ssn:" + k1.ssn);
		
		Korean k2 = new Korean("김자바" , "01022222-1111");
		
		System.out.println("k2.name:" + k2.name);
		System.out.println("k2.ssn:" + k2.ssn);

	}

}
