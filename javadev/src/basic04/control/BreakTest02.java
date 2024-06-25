package basic04.control;

import java.util.Scanner;

/*
 * 컴퓨터가 1~100 사이의 난수 발생 이것을 맞추는 게임
 */
public class BreakTest02 {
	public static void main(String[] args) {
		
		int x = (int)(Math.random() * 100) + 1;
		int you = 0;
		int cnt = 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(cnt + ".1~100 사이의 점수를 입력 : ");
			you = sc.nextInt();
			if(x > you) System.out.println("UP");
			else if(x < you) System.out.println("DOWN");
			else break;
			cnt++;
		} while(true);
		
		System.out.println(cnt + "번 만에 맞추셨습니다");
		sc.close();
	}

}
