package ex01;

public class MathExample {

	public static void main(String[] args) {
		
		//절대값 > Math.abs
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		
		System.out.println("v1:" + v1);
		System.out.println("v2:" + v2);
		
		//올림처리(소수점을) >Math.ceil
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		
		System.out.println("v3:" + v3);
		System.out.println("v4:" + v4);
		
		//버림처리(소수점을) > Math.floor
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		
		System.out.println("v5:" + v5);
		System.out.println("v6:" + v6);
		
		//제일 큰 수
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3,2.5);
		
		System.out.println("v7:" + v7);
		System.out.println("v8:" + v8);
		
		//제일 작은 수
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3,2.5);
		
		System.out.println("v9:" + v9);
		System.out.println("v10:" + v10);
		
		//랜덤
		//0<= 난수 <1
		//(int)(Math.random()*100)+1  >  1~ 100 까지 난수를 발생시킴
		double v11 = Math.random();
		System.out.println("v11:" + v11);
		
		
		//특정 값의 가장 가까운 실수값으로 리턴타입은
		//double
		double v12 = Math.rint(5.3); //5.0
		double v13 = Math.rint(5.7); //6.0
		
		System.out.println("v12:" + v12);
		System.out.println("v13:" + v13);
		
		//리턴타입이 long
		long v14 = Math.round(5.3);//5
		double v15 = Math.round(5.7);//6
		
		System.out.println("v14:" + v14);
		System.out.println("v15:" + v15);
		
		
		double value = 12.3456;
		double temp1 = value * 100;//1234.56
		long temp2 = Math.round(temp1);//1235
		double v16 = temp2 / 100.0;//12.35
		
		System.out.println("v16:" + v16);
		

	}


}
