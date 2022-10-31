package day1031;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//프로그램 종료 여부
		boolean run = true;
		//학생 수
		int studentNum =0;
		//정수형 성적배열
		int [] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생점수: 2.점수입력: 3.점수리스트: 4.분석: 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(scanner.nextLine());
		
			
			
			
			if(selectNo == 1){
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				//new를 사용해서 학생 배열을 초기화 함
				scores = new int[studentNum];
				
			}else if(selectNo == 2){
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]:");
					//System.out.printf("scores[%d]>",i);
					
					//입력받은 값을 배열에 대입
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				
			}else if(selectNo == 3){//배열의 값을 출력
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]:" + scores[i]);
					//System.out.printf("scores[%d]>%d\n",i,scores[i]);
				}
				
			}else if(selectNo == 4){//최대값,평균
				int max = scores[0];//최대값 초기값
				int min = scores[0];//최저값 초기값
				int sum = 0;//총점
				double avg =0;//평균
				
				//향상된  for문
				//변수 : 배열이름 지정해서 변수에 계속 담는다
				for(int score : scores) { 
					//Math.max > 최대값
					//최대값과 score변숭에 담긴 값을 비교한다
					max = Math.max(max, score);
					min = Math.min(min, score);
					sum+= score;
				}
				
				/*
				 * for(int i=0; i<scores.length; i++) 
				 * { max = (max < scores[i]) ? scores[i] :  max;
				 *   sum +=scores[i]; }
				 */
				
				System.out.println("최고 점수:" + max);
				System.out.println("최저 점수:" + min);
				avg = (double) sum / studentNum;
				System.out.printf("평균:%.1f\n",avg);
				
			}else if(selectNo == 5){//종료
				run = false;
			}else {
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

}




