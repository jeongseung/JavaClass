package oop12.garbage;

interface A {
	
}

interface B {
	
}

public class RefMe extends Object implements A, B{
	
	public RefMe() {
		System.out.println("태어남!");
	}

	//인스턴스 소멸 직전 호출되는 메소드
	@Override
	protected void finalize() throws Throwable {
		System.out.println("die");

	}

}
