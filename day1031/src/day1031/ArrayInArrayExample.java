package day1031;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		//mathScores는 정수형으로 2차원 배열 선언
		//i<mathScores.length;     행 2  [] [] []
		//k<mathScores[i].length;  열 3  [] [] []
		int[][] mathScores = new int [2][3];
		for(int i=0; i<mathScores.length; i++) {//행 인덱스 지정
			for(int k=0; k<mathScores[i].length; k++) {//열 인덱스 지정
				System.out.println
				("mattScores["+i+"]["+k+"]=" + mathScores[i][k]);
			}
		}

		System.out.println();
		
		
		
		//행이 2개이고 열은 지정 하지 않음
		// 열은 2 3 4... 가 올수가 있다 [][]  [][][]  [][][]
		int[][]englishScores = new int[2][];
		//첫번째열을 2개[][]
		englishScores[0] = new int[2];
		//두번째열은 3개[][][]
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {//행 가져옴
			for(int k=0; k<englishScores[i].length; k++) {//열 가져옴
				System.out.println
					("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
				
			}
		}
		System.out.println();
		
		//초기 값을 주어진 경우
		int[][]javaScores = 
			{{95, 80},      //1행  [] []
			 {92, 96, 80}}; //2행  [] [] []
		for(int i=0; i<javaScores.length; i++) {//행 가져옴
			for(int k=0; k<javaScores[i].length; k++) {//열 가져옴
				System.out.println
					("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
				
			}
		}
	}

}
