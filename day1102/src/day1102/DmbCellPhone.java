package day1102;

//자식 클래스 DmbCellPhone 부모클래스 CellPhone
public class DmbCellPhone extends CellPhone {

	//자식 클래스에서 별로도 사용하기 위해서 필드 선언
	int channel;

	//매개변수 3개짜리 생성자
	//model,color는 부모필드를 사용하고 channel이 만듬
	public DmbCellPhone(String model, String color, int channel) {
		this.modle = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메서드
	//자식 클래스에서 사용하기 위해서 메서드를 선언
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
	

}
