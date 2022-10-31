package day1031;

public class MainStringArrayArgument {
	//JVM(Java Virtual Machine)이 클래스의 main()
	//메서드를 제일먼저 찾는다.
	//매개변수는 문자열 배열형태로 대입된다.
	//args[0] = 100,args[1] = 200
	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("매개변수의 값이 부족합니다.");
			System.exit(0);//프로그램을 종료
		}
		
		String strNum1 = args[0];//100
		String strNum2 = args[1];//200
		
		//문자열을 정수형으로 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		

	}

}
