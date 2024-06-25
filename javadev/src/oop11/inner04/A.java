package oop11.inner04;

public class A {
	int a = 3; //필드
	
	void abc() {
		int b = 5; //지역 변수
		//지역 이너 클래스
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				//b = 7; //지역 이너 클래스에서 사용하는 지역 변수는 자동 final 선언
			}
		}
		B bb = new B();
		bb.bcd();
				
	}

}
