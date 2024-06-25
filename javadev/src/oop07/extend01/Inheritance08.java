package oop07.extend01;

class A8 {
	protected void abc() {}
}

class B8 extends A8{
	public void abc() {}
}

class C8 extends A8 {
	protected void abc() {}
}

class D8 extends A8 {
	//void abc() {} 		//default 접근 지정자(좁아져서 불가능)
}

class E8 extends A8 {
	//private void abc() {} 	//priate 접근 지정자(좁아져서 불가능)
}

public class Inheritance08 {
	public static void main(String[] args) {
		
	}

}
