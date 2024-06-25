package oop08.abstract01;

class Animal {
	void cry() {}
}

class Cat extends Animal {

	@Override
	void cry() {
		System.out.println("야옹");
	}
	
}

class Dog extends Animal {
	
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}


public class Abstract01 {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
		
	}
}
