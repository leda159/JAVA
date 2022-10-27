package day1027;

public class StringConcatExample {
	public static void main(String[] args) {

		int value = 10 + 2 + 8;
		System.out.println("value:" + value);//20
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1:" + str1);//128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2:" + str2);//1028

		String str3 = "10" + 2 + 8;
		System.out.println("str3:" + str3);//1028

		String str4 = "10" + (2 + 8);
		System.out.println("str4:" + str4);//1010


	}

}
