package day1101;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("12345-67890", "홍길동");
		
		System.out.println(p1.name);
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7890";
		
		p1.name = "홍삼원";
		System.out.println(p1.name);
	}

}
