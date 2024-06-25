package oop09.interface03;

interface A {
	public abstract void abc();
}

interface B {
	void bcd();		//public abstract 자동 추가
}

class C implements A {
	public void abc() {
		
	}
}

// public -> default 불가능
//class D implements B {
//	void bcd() {
//		
//	}
//}



public class InheritanceOfInstance {
	public static void main(String[] args) {
		
	}
}
