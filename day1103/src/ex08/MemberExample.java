package ex08;

public class MemberExample {

	public static void main(String[] args) {
		
		//SILVER 고객 인스턴스 생성
		Member m = new Member("이순신",10000);
		
		//VIP 고객 인스턴스 생성
		VIPCustomer v = new VIPCustomer("강감찬",20000);
		
		//Gold 고객 인스턴스 생성
		GoldCustomer g = new GoldCustomer("홍길동",30000);

		m.memberInfo();
		v.memberInfo();
		g.memberInfo();
	}

}
