package oop07.object;

class A1 {
	String name;
	A1(String name) {
		this.name = name;
	}
}

class B1 {
	String name;
	B1(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B1)obj).name) {
			return true;
		} else 
			return false;
	}
}

public class Object02 {
	public static void main(String[] args) {
		A1 a1 = new A1("안녕");
		A1 a2 = new A1("안녕");
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		B1 b1 = new B1("안녕");
		B1 b2 = new B1("안녕");
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2 ));
	}

}
