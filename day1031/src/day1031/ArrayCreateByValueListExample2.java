package day1031;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {

		//int scores[];
		//scores = new int[] {83,90,87};
		int [] scores = new int[] {83, 90, 87};
		int sum1 = 0;
		
		for(int i=0;i<scores.length;i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합계:" + sum1);
		
		
		//메서드에 매개변수로 배열을 전달 new int[] {83,90,87}
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합계:" + sum2);
		System.out.println();
	}
	
	//매개변수를 받음 new int[] {83,90,87}
	//sum에 더해서 return 한다
	public static int add(int[] scores) {
		
		int sum = 0;
		
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		
		return sum;
	}

}




