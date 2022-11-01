package exam09;

public class Car {

	//필드를 캡슐화 (=정보은닉)
	
	//차 속도
	private int speed;
	//차 정지 or 달리는중?
	private boolean stop;
	
	//값을 가져올때get
	public int getSpeed() {
		return speed;
	}
	
	//값을 대입할때 set
	public void setSpeed(int speed){
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	//boolean 일때 는 getStop 보단 isStop을 많이 사용함
	public boolean isStop(){
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}











