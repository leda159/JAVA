package day1101;

public class Computer {

	//sum1 메서드
	//매개변수가 배열 형태로 들어온다
	//리턴 타입은 정수형
	int sum1(int[] values) {
		int sum = 0;
		//배열에 있는 값을 더한다
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	//sum2 메서드
	//... > 매개변수의 갯수를 모를 경우
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
