package day1031;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				//continue를 만나면 i++에 가서 i값을 증가시킨다
				continue;
			}
			System.out.println(i);
		}

	}

}
