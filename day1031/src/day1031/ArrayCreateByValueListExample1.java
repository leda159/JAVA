package day1031;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {

		//자료형[] 배열이름 = new 자료형[배열크기];
		//int[] scores = new int[]{83,90,87};
		//정수형 배열 scores 선언
		int[] scores = {83,90,87};
		
		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);
		System.out.println("scores[2]:" + scores[2]);
		
		int sum = 0;
		
		//배열은 인덱스가 0부터 시작
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		
		System.out.println("총합계:" + sum);
		
		//배열이름.length => 배열크기
		double avg = (double) sum / scores.length;
		
		//소숫점 첫째자리 까지 출력
		System.out.printf("평균:%.1f",avg);

	}

}



