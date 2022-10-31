package day1031;

public class ContinueExample {
	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			if(i % 2 != 0) {//홀수이면
				continue;//for문의 증가치(감소치)로 이동
			}
			
			System.out.println(i);
		}

	}

}
