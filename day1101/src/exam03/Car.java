package exam03;

public class Car {
	
	//접근제한자를 선언 하지 않았으므로 필드 default
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	//생성자 오버로딩
	//생성자 이름은 동일하고 매개변수의 갯수,순서,자료형을
	//달리하여 여러개를 선언하는 기법
	Car(){}
	
	//매개변수1인 생성자
	Car(String model){
		this.model = model; 
	}
	
	//매개변수2인 생성자
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	//매개변수3인 생성자
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
