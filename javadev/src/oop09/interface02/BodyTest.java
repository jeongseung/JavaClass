package oop09.interface02;

public class BodyTest {
	public static void main(String[] args) {
		BodySign bs = new Pitcher();
		bs.throwBall(BodySign.CENTER);
		bs.throwBall(BodySign.LEFT);
		bs.throwBall(BodySign.RIGHT);
	}
	

}
