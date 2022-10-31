package day1031;

public class ArraySumExample {

	public static void main(String[] args) {
		
		//3*5 배열 선언
		int [][] multArray = {
				{80, 70, 31, 12, 62 },
				{88, 34, 90, 45, 100},
				{70, 23, 65, 5, 32}};
		
		int sum = 0;
		for(int i=0; i<multArray.length; i++) {//행 인덱스
			for(int k=0; k<multArray[i].length; k++) {//열 인덱스
				
				if(multArray[i][k] % 5 == 0) {
					sum += multArray[i][k];
					
				}
			}
		}
		System.out.printf("배역 값중 5의 배수 합계:%,d" , sum);
	}

}
