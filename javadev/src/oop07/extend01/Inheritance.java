package oop07.extend01;


public class Inheritance {
	
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김현지";
		h.age = 22;
		h.eat();
		h.sleep();

		Student stu = new Student();
		stu.name = "전수빈";
		stu.age = 25;
		stu.goToSchool();
		stu.eat();
		
		Worker w = new Worker();
		w.name = "정원석";
		w.age = 28;
		w.goToWOrkr();
		
	}
	
	

}
