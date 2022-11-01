package exam05;

public class Car {
	
	//필드,메서드는 접근제한자 default로 선언함
	//같은 패치지에 있는 클래스들만 접근 허용가능함
	int gas;
	
	//메서드
	//void이므로 리턴타입이 없다
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//메서드
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	//메서드
	//void지만 리턴타입이 있다?
	//예외적으로 void문 안에 리턴을 사용할수 있다.
	//여기서 return의 의미는 '프로그램을 종료 한다' 는 의미
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas= gas -1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return;
			}
		}
	}
}
