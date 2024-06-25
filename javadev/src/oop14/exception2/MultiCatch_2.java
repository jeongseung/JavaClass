package oop14.exception2;

public class MultiCatch_2 {
	public static void main(String[] args) {
		
		try {
			System.out.println(3/1); 
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
		finally {
			System.out.println("종료");
		}
	}
}