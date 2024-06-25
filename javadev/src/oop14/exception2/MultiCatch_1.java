package oop14.exception2;

public class MultiCatch_1 {
	public static void main(String[] args) {
		try {
			System.out.println(3/0); //실행 예외
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("종료");
		}
		
		try {
			int num = Integer.parseInt("10A");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		}
		finally {
			System.out.println("종료");
		}
		System.out.println();
		
		//다중 try catch
		try {
			System.out.println(3/0); //실행 예외
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		}
		finally {
			System.out.println("종료");
		}
		
		
	}

}
