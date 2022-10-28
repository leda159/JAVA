package day1028;

import java.util.Scanner;

public class ScoreExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int math = scanner.nextInt();
		int eng = scanner.nextInt();
		int kor = scanner.nextInt();
		
		int total = math + eng + kor ;
		double evr = (double)total / 3 ;
		String grade ="";
		
		if(evr >= 90) {
			grade="A학점";
		}else if(evr >= 80) {
			 grade="B학점";
		}else if(evr >= 70) {
			 grade="C학점";
		}else if(evr >= 60) {
			 grade="D학점";
		}else {
			 grade="F학점";
		}
		
		
		/*
		 * String grade = (evr >= 90) ? "A" : 
		 *  			  (evr >= 80) ? "B" : 
		 *  			  (evr >= 70) ? "C" : 
		 *  			  (evr >= 60) ? "D" : "F" ;
		 *  
		 *  
		 *  */

		System.out.printf("%s 학생 성적표\n",name);
		System.out.printf("총점:%,d\n",total);
		System.out.printf("평균:%.1f\n",evr); //.1f : 소수점 첫째자리까지 표시
		System.out.printf("학점:%s\n",grade);
		
		
		
		

	}

}
