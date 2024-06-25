package oop11.inner03;

public class A {
	int a = 3;
	static int b = 4;
	
	void method1() {
		System.out.println("Outer 클래스의 A의 method1() 수행");
	}
	static void method2() {
		System.out.println("Outer 클래스의 A의 method2() 수행");
	}
	
	static class B {
		void bcd() {
			
			//static만 호출 가능
			
			//필드 사용
//			System.out.println(a);
			System.out.println(b);
			
			//메서드 사용
			// method1();
			method2();
		}
	}
}
