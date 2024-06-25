package oop20.generic03;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		MyClass<Integer> mc2 = new MyClass<Integer>();
		mc2.set(12);
		System.out.println(mc2.get());
		
		
		
	}

}
