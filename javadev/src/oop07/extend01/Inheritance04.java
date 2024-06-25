package oop07.extend01;

class A4{}
class B4 extends A4{}

public class Inheritance04 {
	public static void main(String[] args) {
		A4 aa = new A4();
		B4 ab = new B4();
		
		System.out.println(aa instanceof A4);
		System.out.println(ab instanceof A4);

		System.out.println(aa instanceof B4);
		System.out.println(ab instanceof B4);
		
		if(aa instanceof B4) {
			B4 b = (B4) aa;
			System.out.println("aa를 B로 캐스팅 했습니다");
		} else {
			System.out.println("aa는 B타입으로 캐스팅 불가능");
		}
		
		if (ab instanceof B4) {
			B4 b = (B4) ab;
			System.out.println("ab를 B로 캐스팅했습니다");
		} else {
			System.out.println("ab는 B타입으로 캐스팅이 불가능");
		}
		
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String클래스입니다. ");
		}
		
		
		
	}

}
