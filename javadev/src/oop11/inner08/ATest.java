package oop11.inner08;

public class ATest {
	
	public static void main(String[] args) {
		
		C c = new C();
		//방법1. 클래스명O + 참조변수명 O
		A a = new B();
		c.cde(a);
		//방법2. 클래스명O + 참조변수명 X
		c.cde(new B());
		
	}

}
