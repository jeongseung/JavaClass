package oop08.abstract01;

public class Rectangle extends Shape{

	int w = 10, h = 5;
	
	@Override
	public void area() {
		res = w * h;
	}
	
}
