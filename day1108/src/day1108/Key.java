package day1108;

public class Key {

	public int number;
	
	//매개변수로 번호
	public Key(int number) {
		this.number = number;
	}

	//Object 클래스의 equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			
			if(this.number == compareKey.number) {
				return true;
			}
		}
		
		return false;
	}

	//Object 클래스의 hashCode()는 객체의 주소값을 비교
	@Override
	public int hashCode() {
		return number; //주소가 아닌 학생번호를 리턴
	}
	
}








