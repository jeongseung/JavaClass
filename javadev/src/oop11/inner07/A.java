package oop11.inner07;

public class A {

	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

interface C {
	public abstract void bcd();
}


