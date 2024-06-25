package oop03.external01;
import basic.*;
import basic.test.*;

public class PackageTest01 {
	
	public static void main(String[] args) {
		basic.A a = new basic.A();
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		Car car = new Car();
		car.drive();
		
	}

	
}
