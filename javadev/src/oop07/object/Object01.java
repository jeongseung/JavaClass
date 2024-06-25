package oop07.object;

class A {
	int a = 3;
	int b = 4;

}

class B {
	int a = 3;
	int b = 4;
	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + "]";
	}

}



public class Object01 {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		System.out.printf("%x\n", a.hashCode());
		System.out.println(a.toString());
		System.out.println(b);
	}
}
