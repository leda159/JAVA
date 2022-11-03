package ex06;

public class Example {

	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();

		//자동 타입변환
		//InterfaceA ia = new ImplementationC();
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
