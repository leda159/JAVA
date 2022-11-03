package day1103;

public class CardExample {

	public static void main(String[] args) {
		
		HCard h = new HCard("홍길동",10000);
		KCard k = new KCard("이순신",30000);
		
		h.orderInfo();
		k.orderInfo();
	}

}
