package day1031;

public class ArrayRandom {

	public static void main(String[] args) {
		
		int [] intArray = new int[30];
		//int[30] intArray = {};
		
		int sum = 0;//총합
		int even = 0;//짝수합
		int odd = 0;//홀수합
		int max = intArray[0];//최대값
		int min = intArray[0];//최소값
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*900)+1;
			
			
			if(intArray[i] % 2 == 0) {//짝수 경우
				even+=intArray[i];
			}else {//홀수 경우
				odd+=intArray[i];
			}
			
			sum+=intArray[i];//총합
			
			
			if(intArray[i] > max) {
				max = intArray[i];//최대값 변경
			}
			if(intArray[i] < min) {
				min = intArray[i];//최소값 변경
			}
		
		}
	
		
		
		System.out.printf("짝수합:%,d\n",even);
		System.out.printf("홀수합:%,d\n",odd);
		System.out.printf("총합계:%,d\n",sum);
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		

	}

}




/*
 * package day1031;
 * 
 * public class ArrayRandom { public static void main(String[] args) {
 * 
 * //정수형 배열 선언 int[] intArray = new int[30];
 * 
 * for(int i=0;i<intArray.length;i++) { //1부터 900사이의 숫자중 난수 발생 intArray[i] =
 * (int)(Math.random()*900)+1; }
 * 
 * int evenSum=0,oddSum=0,totalSum=0; int maxValue=intArray[0];//최대값 int
 * minValue=intArray[0];//최소값
 * 
 * for(int i=0;i<intArray.length;i++) { if(intArray[i] % 2 == 0) {//짝수 evenSum
 * += intArray[i]; }else { oddSum += intArray[i];//홀수 }
 * 
 * totalSum += intArray[i];//총합계
 * 
 * if(maxValue < intArray[i]) { maxValue = intArray[i];//최대값 변경 }
 * 
 * if(minValue > intArray[i]) { minValue = intArray[i];//최소값 변경 }
 * 
 * }
 * 
 * System.out.printf("짝수합:%,d\n",evenSum);
 * System.out.printf("홀수합:%,d\n",oddSum);
 * System.out.printf("총합계:%,d\n",totalSum);
 * System.out.printf("최대값:%,d\n",maxValue);
 * System.out.printf("최소값:%,d\n",minValue);
 * 
 * }
 * 
 * }
 */
