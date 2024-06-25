package oop11.inner01;

public class A1 {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A클래스 메서드 abc() 수행");
	}

	//인스턴스 이너 클래스
	class B {
		
		int a = 5;
		int b = 6;
		
		void abc() {
			System.out.println("Inner클래스인 B의 abc() 메서드 수행");
		}
		
		void bcd() {
			//Inner 클래스의 멤버 사용
			System.out.println(a);
			System.out.println(this.a);
			System.out.println("A1의 this : " + A1.this.a);
			System.out.println(b);

			//아우터 클래스의 멤버 사용
			abc();
			this.abc();
			A1.this.abc();
			
		}
	}
}