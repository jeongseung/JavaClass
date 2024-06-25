package oop09.interface03;

public class FlyingCar implements Drivable, Flyable{

	@Override
	public void fly() {
		System.out.println("하늘을 납니다");
	}

	@Override
	public void drive() {
		System.out.println("드라이브");
	}
	
	

}
