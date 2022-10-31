package day1031;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		//자료형[] 배열이름 = new 자료형[배열크기];
		int[] scores = new int[] {83, 90, 87};
		//정수형 배열 scores 선언
		//int[] scores = {83, 90, 87};
		//
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		
		int sum = 0;
		//배열은 인덱스가 0부터 시작
		for(int i=0; i<3; i++) {
			//sum = sum + scores;
			sum+=scores[i];
		}
		System.out.println("총합 : " + sum);
		//배열이름.length => 배열크기
		//소수점이 발생하므로 캐스팅 함
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		
		//printf를 활용해서 소수점 첫째자리까지 출력
		System.out.printf("평균:%.1f",avg);
	}
}
