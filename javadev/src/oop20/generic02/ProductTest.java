package oop20.generic02;

class Apple{}
class Pencil{}
class Goods {
	private Object object;
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple) goods1.getObject();
		
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
	}
}
