package day1101;

public class Person {

	//final : 필드에 최초로 초기값이 부여되면 값 변경 불가
	final String nation = "Korea";
	final String ssn; 
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
