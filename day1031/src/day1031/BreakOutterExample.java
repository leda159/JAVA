package day1031;

public class BreakOutterExample {

	public static void main(String[] args) {
		
		//라벨을 표시 바깥쪽에 있는 for문 까지 break 걸림
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "_" + lower);
				
				if(lower == 'q') {
					//반복문 탈출
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
