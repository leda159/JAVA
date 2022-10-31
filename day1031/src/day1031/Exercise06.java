package day1031;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {

		boolean run = true;//프로그램 종료 여부
		int studentNum = 0;//학생수
		int[] scores = null;//정수형 성적배열
		Scanner s = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			
			System.out.println("선택>");
			int selectNo = s.nextInt();
			
			if(selectNo == 1) {//학생수 입력
				System.out.print("학생수>");
				studentNum = s.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2){//점수입력
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d]>",i);
					//입력받은 값을 배열에 대입
					scores[i] = s.nextInt();
				}
			}else if(selectNo == 3){//배열의 값을 출력
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d]>%d\n"
							,i,scores[i]);
				}
			}else if(selectNo == 4){//최대값,평균
				int maxValue = scores[0];//최대값을 첫번째값으로 지정
				int minValue = scores[0];//최소값을 첫번째값으로 지정
				int totalSum = 0;//총점
				double avg;//평균
				
				//배열일 경우 향상된 for문 사용 가능
				for(int score : scores) {
					//최대값을 구한다.
					maxValue = Math.max(maxValue,score);
					minValue = Math.min(minValue,score);
					totalSum += score;//성적 총합계를 구한다.
				}
				
				System.out.printf("최고점수:%d\n",maxValue);
				System.out.printf("최저점수:%d\n",minValue);
				avg = (double)totalSum / scores.length;
				System.out.printf("평균:%.1f\n",avg);
				
			}else if(selectNo == 5){//종료
				run = false;
			}else {
				System.out.println("메뉴를 다시 선택하세요!");
			}
		}

		System.out.println("프로그램을 종료합니다.");
	}

}
