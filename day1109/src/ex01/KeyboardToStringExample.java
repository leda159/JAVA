package ex01;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {

byte[] bytes = new byte[100];

System.out.print("입력:");
//데이터를 입력하고 엔터를 클릭하기 전까지
//입력한 내용을 배열에 대입
//데이터 마지막에 CR(Carrige Return),LF(Line Feed)이
//배열에 대입된다.
int readByteNo = System.in.read(bytes);

//-2를 하면 CR,LF를 제외한다.
String str = new String(bytes,0,readByteNo-2);
System.out.println(str);

}

}
