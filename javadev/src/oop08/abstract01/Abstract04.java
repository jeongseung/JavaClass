package oop08.abstract01;

abstract class A4 {
	abstract void abc();
}

public class Abstract04 {
	
	public static void main(String[] args) {
		
		
		//객체 생성
		A4 a1 = new A4() {
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		A4 a2 = new A4() {
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();
	}
	
	

}
