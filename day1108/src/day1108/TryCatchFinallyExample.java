package day1108;

public class TryCatchFinallyExample{
	public static void main(String[] args) {

		try {
			
			//1.Object : 모든 클래스의 부모클래스
			//2.String : 문자열을 표시하는 객체
			//3.Wrapper 클래스:기본자료형을 객체타입으로 선언
			//Byte,Short,Integer,Long
			//Character,Float,Double,Boolean
			//박싱(Boxing)? 기본자료형을 객체타입으로 변환
			//Integer a = new Integer(100);
			//언박싱(UnBoxing)?객체타입을 기본자료형으로 변환
			//int b = Integer.valueOf(a);
			//4.클래스 Class:클래스의 모든 정보를 가지는 클래스
			//클래스를 로딩처리
			//Class.forName : 데이터베이스 드라이버 로딩시 사용
			Class clazz = Class.forName("java.lang.String");
			
			System.out.println("String 객체 로딩 성공");
			
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}finally {//반드시 실행하는 문장을 선언
			//데이터베이스 사용시 close 메서드 선언
			System.out.println("다시 확인하세요!");
		}
	}
}




