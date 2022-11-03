package ex02;

public class SoundableExample {
	
	//자동타입변환
	//Soundable soundable = new Cat();
	//Soundable soundable = new Dog();
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
		
	}

}

