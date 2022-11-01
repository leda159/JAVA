package day1101;

public class SingletonExample {

	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton();
		//Singleton obj2 = new Singleton();
		
		//싱글톤 패턴으로 지정된 메서드를 호출 하였으므로
		//두개의 참조변수 주소는 동일하다.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다");
		}else {
			System.out.println("다른 Singleton 객체 입니다");
		}
	}

}
