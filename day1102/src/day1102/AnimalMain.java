package day1102;

public class AnimalMain {

	public static void main(String[] args) {
		
		Cat cat = new Cat("야옹이", "10");
		Tiger tiger = new Tiger("호랑이", "5");
		
	
		tiger.tigerRun();
		tiger.tigerCry();
		
		cat.walk();
		cat.cry();
		
	}

}
