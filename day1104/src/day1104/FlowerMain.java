package day1104;

import java.util.ArrayList;

public class FlowerMain {

	public static void main(String[] args) {
		
		//인스턴스 생성
		Flower f1 = new Flower();
		f1.setName("장미");
		f1.setPrice(1500);
		
		
		Flower f2 = new Flower();
		f2.setName("튤립");
		f2.setPrice(3000);
		
		
		Flower f3 = new Flower();
		f3.setName("해바라기");
		f3.setPrice(2500);
		
		ArrayList<Flower> flowerList = 
				new ArrayList<Flower>();
		
		//ArrayList에 추가
		flowerList.add(f1);
		flowerList.add(f2);
		flowerList.add(f3);
		
		//향상된 for문
		//   타입     변수명  배열변수명
		for(Flower flower:flowerList) {
			flower.flowerInfo();
		}
	}

}
