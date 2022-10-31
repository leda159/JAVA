package day1031;

public class ArrayRandom {
	public static void main(String[] args) {

		//정수형 배열 선언
		int[] intArray = new int[30];
		
		for(int i=0;i<intArray.length;i++) {
			//1부터 900사이의 숫자중 난수 발생
			intArray[i] = (int)(Math.random()*900)+1;
		}
		
		int evenSum=0,oddSum=0,totalSum=0;
		int maxValue=intArray[0];//최대값
		int minValue=intArray[0];//최소값
		
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i] % 2 == 0) {//짝수
				evenSum += intArray[i];
			}else {
				oddSum += intArray[i];//홀수
			}
			
			totalSum += intArray[i];//총합계
			
			if(maxValue < intArray[i]) {
				maxValue = intArray[i];//최대값 변경
			}
			
			if(minValue > intArray[i]) {
				minValue = intArray[i];//최소값 변경
			}
			
		}
		
		System.out.printf("짝수합:%,d\n",evenSum);
		System.out.printf("홀수합:%,d\n",oddSum);
		System.out.printf("총합계:%,d\n",totalSum);
		System.out.printf("최대값:%,d\n",maxValue);
		System.out.printf("최소값:%,d\n",minValue);

	}

}