package day1102;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//자식 클래스에 접근하기 위해 DmbCellPhone 인스턴스를 생성함
		//매개변수 3개짜리 생성자를 호출함
		//매개변수 3개를 보냄
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델" + dmbCellPhone.modle);
		System.out.println("색상" + dmbCellPhone.color);
		
		System.out.println("채널" + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
