package day1028;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------");
		
		x++; //10       //후치 증가 연산자 ; 다음 줄에가서 x값이 변경된다.
		++x; //11 > 12  //전치 증가 연산자 즉시 x값을 1증가 시킴.
		System.out.println("x="+x);//12
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y="+y);//8
		
		System.out.println("-------------");
		z = x++;
		System.out.println("z="+z); //12
		System.out.println("x="+x); //13
		
		System.out.println("-------------");
		z = ++x;
		System.out.println("z="+z);//14
		System.out.println("x="+x);//14
		
		System.out.println("-------------");
		z=++x + y++; // x:15, y:8 
		System.out.println("z="+z);//
		System.out.println("x="+x);//15
		System.out.println("y="+y);//9
	}
}
