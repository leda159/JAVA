package day1028;

public class ForRandomExample {
	
	  //조건
	  //1.반복문 사용
	  //2.1부터 600까지 숫자중에서 난수 30개를 발생시켜
	  //다음과 같이 출력하도록 코딩
	  //(단,숫자는 우측정렬)
	  //발생된 난수
	  //XX   XX   XX  XX  XX
	  //XX   XX   XX  XX  XX
	  //XX   XX   XX  XX  XX
	  //XX   XX   XX  XX  XX
	  //XX   XX   XX  XX  XX
	  //XX   XX   XX  XX  XX
	  //난수합계:XXX,XXX

	public static void main(String[] args) {
		
		System.out.println("발생된 난수");
		
		int totalSum=0;
		
		//random을 30번 발생시킴
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=5; j++) {
			 int random = (int)(Math.random()*600)+1;
			 
			 //난수 합계
			 totalSum += random;
			 
			 //숫자 3자리 왼쪽에 공백 처리
			 //\t : tab만큼 공백 생김
			 System.out.printf("%3d\t",random);

			}
			//다음줄로 내려감
			System.out.println();
		}
		System.out.printf("\n난수합계:%,d",totalSum);
	}
}
