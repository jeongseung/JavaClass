package oop14.exception2;

public class MultiCatch_3 {
	public static void main(String[] args) {

		// catch 순서 잘못됨
//		try {
//			System.out.println(3/1); 
//			int num = Integer.parseInt("10A");
//		}
//		catch(Exception e) {
//			System.out.println("숫자로 바꿀 수 없습니다.");
//		}
//		catch(NumberFormatException e) {
//			System.out.println("숫자는 0으로 나눌 수 없습니다.");
//		}
//		finally {
//			System.out.println("종료");
//		}
		
		try {
			System.out.println(3/1); 
			int num = Integer.parseInt("10A");
			System.out.println("숫자로 바꿀 수 없습니다.");
		}
		catch(NumberFormatException e) {
		}
		catch(Exception e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("종료");
		}
		
		
	}

}
