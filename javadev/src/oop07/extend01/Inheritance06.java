package oop07.extend01;

class Animal6 {
	void cry() {}
}

class Bird6 extends Animal6 {
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}
class Cat6 extends Animal6 {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog6 extends Animal6 {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class Inheritance06 {
	public static void main(String[] args) {
		Animal6 aa = new Animal6();
		Bird6 bb = new Bird6();
		Cat6 cc = new Cat6();
		Dog6 dd = new Dog6();
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		Animal6 ab = new Bird6();
		Animal6 ac = new Cat6();
		Animal6 ad = new Dog6();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		Animal6[] animals = {ab, ac, ad};
		for(Animal6 an : animals) {
			an.cry();
		}
	}
}
