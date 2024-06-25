package basic07.method;

import java.util.Scanner;

public class ScissorsTest {
	public static void main(String[] args) {
		String[] caption = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3 : ");
		
		int you = sc.nextInt();
		
		int com = (int) (Math.random() * 3) + 1;
		/*
		  	you : 가위
		  	Com : 보
		  	결과 : 당신의 승리입니다.
		 */
		
		System.out.println("YOU : " + caption[you - 1]);
		System.out.println("COM : " + caption[com - 1]);
		
		System.out.println(getMessage(you, com));
	}

	private static String getMessage(int you, int com) {
		switch((you - com + 3) % 3) {
		case 0 : return "비겼습니다";
		case 1 : return "당신이 이겼습니다";
		default : return "당신이 졌습니다";
		}
	}

//	private static String getMessage(int you, int com) {
//		
//		if((you==1&&com==2 )|| (you==2&&com==3)|| (you==3&&com==1)) {
//			return "당신이 졌습니다";
//		} else if(you == com) {
//			return "비겼습니다";
//		} else {
//			return "당신이 이겼습니다";			
//		}
//	}
	
	

}
