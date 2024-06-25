package oop06.static01;

class A2 {
	int m = 3;
	static int n = 5;
}

public class A2test {
	public static void main(String[] args) {
		A2 a1 = new A2();
		A2 a2 = new A2();
		
		a1.m = 5;
		a1.n = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		a1.n = 7;
		a2.n = 8;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		A2.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		
		
	}

}
