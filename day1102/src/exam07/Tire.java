package exam07;

public class Tire {

	public int maxRotation;//바퀴 최대 회전수
	public int accumulatedRotation;//누적 바퀴 회전수
	public String location;//바퀴의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//바퀴 회전수를 체크하는 메서드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명:" +
					(maxRotation - accumulatedRotation) + "회");
			return true;
		}else {//바퀴가 펑크난 경우 
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
