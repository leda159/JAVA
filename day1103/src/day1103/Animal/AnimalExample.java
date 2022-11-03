package day1103.Animal;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-------");
		
		//변수의 자동 타입 변환
		
		
		//부모 클래스를 가르키는 참조변수
		Animal animal = null;
		
		//자식 클래스를 가르킨다
		//자식 클래스가 부모 클래스로 변환된다.
		//부모 클래스에 있는 메서드만 실행가능
		//Animal animal = new Dog();
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("-------");
		
		
		
		//메소드의 다형성
		//메소드의 매개변수로 전달
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	//Animal animal = new Dog();
	private static void animalSound(Animal animal) {
	
		animal.sound();
	}

}
