package day1031;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {

		//배열 선언 & 초기화
		int[] scores = new int[] {83,90,87};
		
		int sum1 = 0;
		
		for(int i=0;i<scores.length;i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합계:" + sum1);
		
		//메서드 매개변수로 배열을 전달
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합계:" + sum2);
		System.out.println();
	}
	
	//int[] scores = new int[] {83,90,87};
	public static int add(int[] scores) {
		
		int sum = 0;
		
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		
		return sum;
	}

}




