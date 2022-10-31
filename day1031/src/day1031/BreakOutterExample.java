package day1031;

public class BreakOutterExample {
	public static void main(String[] args) {

		//라벨을 표시
		Outter: for(char upper='A';upper<='Z';upper++) {
					for(char lower='a';lower<='z';lower++) {
					System.out.println(upper + "-" + lower);
					
					if(lower == 'q') {
						//바깥쪽 for문 까지 탈출
						break Outter;
					}
				}
		}

		System.out.println("프로그램 종료");
	}

}
