package ex06;

//인터페이스는 한개이상의 인터페이스를 상속 가능
//A,B를 상속 받았기 때문에
//methodA,B,C 접근 가능
public interface InterfaceC extends InterfaceA, InterfaceB {
	
	
	public void methodC();
}
