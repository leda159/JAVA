package day1031;

public class ArrayInArrayExample {
	public static void main(String[] args) {

		//정수형 이차원 배열 선언
		int[][] mathScores = new int[2][3];
		
		for(int i=0;i<mathScores.length;i++) {//행 인덱스 지정
			for(int k=0;k<mathScores[i].length;k++) {//열 인덱스 지정
				System.out.println("maxScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}

		System.out.println();
		
		//영어성적은 행만 지정
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0;i<englishScores.length;i++) {
			for(int k=0;k<englishScores[i].length;k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = {
				{95,80},//1행
				{92,96,80}//2행
		};
		
		for(int i=0;i<javaScores.length;i++) {
			for(int k=0;k<javaScores[i].length;k++) {
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
			}
		}
		
	}

}
