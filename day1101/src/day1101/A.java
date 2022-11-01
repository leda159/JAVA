package day1101;

public class A {

	//필드
	public int field1;//모든 클래스에서 접근 가능
	int field2;//default로 선언되었으므로 같은 패키지 안에 있는 클래스에서만 접근허용
	private int field3;//Getter/Setter 메서드를 통해서 접근허용
	
	//기본 생성자(기능:필드 초기화)
	public A() {
		
		field1 =1;
		field2 =1;
		field3 =1;
		
		method1();
		method2();
		method3();
		
	}
	
	//모든 클래스 접근 허용
	public void method1() {};
	//default이므로 같은 패키지 내 클래스에서만 접근 허용
	void method2() {};
	
	private void method3() {}

	public int getField3() {
		return field3;
	}

	public void setField3(int field3) {
		this.field3 = field3;
	}
	
	
}
