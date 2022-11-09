package day1108;

public class ExitExample {
	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
			if(i == 5) {
				//시스템을 종료
				System.exit(0);
			}
		}

		System.out.println("마무리코드");
	}

}
