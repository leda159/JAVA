package day1031;

public class ArraySumExample {
	public static void main(String[] args) {

		//3*5 배열 선언
		int[][] multiArray = {
				{80,  70,  31,  12,  62},
				{88,  34, 90,  45,  100},
				{70,  23,  65,  5,   32}	
		};
		
		int fiveSum=0;
		
		for(int i=0;i<multiArray.length;i++) {//행인덱스
			for(int j=0;j<multiArray[i].length;j++) {//열인덱스
				
				if(multiArray[i][j] % 5 == 0) {//5배수
					fiveSum += multiArray[i][j];
				}
			}
		}
		
		System.out.printf("5의 배수의 합계:%,d",fiveSum);
	}

}



