package day1102;

public class CardExample {

	public static void main(String[] args) {

		HCard h = new HCard("이순신",10000);
		
		KCard k = new KCard("홍길동",20000);
		
		h.pointInfo();
		k.pointInfo();
	}

}
