package oop07.object;

class Person {
	String name;
	int age;
	
	
}

public class ObjectTest {
	
	public static void main(String[] args) {
		Person p1  = new Person();
		Person p2  = new Person();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
