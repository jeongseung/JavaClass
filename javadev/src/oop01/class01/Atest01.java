package oop01.class01;

public class Atest01 {

	String name;
	int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Atest01 [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Atest01 a = new Atest01();
		
		a.name = "jsw";
		a.age = 28;
		System.out.println(a);
		
	}
	
	
}
