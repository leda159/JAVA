package day1108;

public class Member {

	public String id;//문자열 필드
	
	//생성자 (문자열 매개변수)
	public Member(String id) {
		this.id = id;
	}

	//String 객체의 equals 메서드는 실제 값을 비교
	@Override
	public boolean equals(Object obj) {

		//다운캐스팅을 하기 위해서 Member라는 클래스가
		//Object를 상속받은 자식클래스인지 여부 체크
		if(obj instanceof Member) {
			//다운캐스팅(자식클래스의 필드,메서드에 접근하기
			//위해)
			Member member = (Member)obj;
			
			//매개변수와 필드값을 비교
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}
	
	
}





