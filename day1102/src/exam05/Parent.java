package exam05;

public class Parent {

	public String nation;
	
	
	public Parent() {
		this("대한민국");
		///2
		System.out.println("Parent() call");
	}

	
	public Parent(String nation) {
		this.nation = nation;
		//1
		System.out.println("Parent(String nation) call");
	}
}
