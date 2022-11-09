package day1107.exam15;

//부모클래스
class Animal {
	public void move() {
		System.out.println("걸어다닌다.");
	}
}

//자식클래스
class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("네발로 걸어다닌다.");
	}
		
}
class Cat extends Animal {
	@Override
	public void move() {
		System.out.println("두발로 점프한다.");
	}	
}

public class ClassCastExceptionExample {
	public static void main(String[] args) {

		//자식클래스의 인스턴스 생성
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	//Animal animal = new Dog();
	//자식클래스가 부모클래스로 자동 타입 변환
	//부모클래스에 있는 메서드,필드에만 접근 가능
	//Animal animal = new Cat();
	public static void changeDog(Animal animal) {
		//다운캐스팅:자식클래스에 있는 메서드에 접근 가능
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.move();
		}
		
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.move();
		}
		

	}

}


