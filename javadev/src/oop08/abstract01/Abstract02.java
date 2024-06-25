package oop08.abstract01;

abstract class Animal1 {
	abstract void cry();
}

class Cat1 extends Animal1 {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog1 extends Animal1 {
	void cry() {
		System.out.println("멍멍");
	}
}

public class Abstract02 {
	
	public static void main(String[] args) {
		Animal1 animal1 = new Cat1();
		Animal1 animal2 = new Dog1();
		animal1.cry();
		animal2.cry();
	}
}
