package day1108;

public class SystemTimeExample {
	public static void main(String[] args) {

		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1부터 100000까지 합:" + sum);
		System.out.println("계산시간:" + (time2-time1) + "나노초 소요");
	}

}
