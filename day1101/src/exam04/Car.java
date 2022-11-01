package exam04;

public class Car {
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	
	Car(String model){
		
		this(model,"은색",250);
	}
	
	//매개변수 2개짜리 생성자 호출 함 
	//자신의 매개변수 3개 생성자를 호출
	Car(String model,String color){
		this(model,color,250);
	}
	
	Car(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

