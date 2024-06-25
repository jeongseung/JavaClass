package oop.classtest;
// 반 X 반 X 3.14
// 가로 세로
// 밑 높 / 2

import java.util.Scanner;

public class Area {
	
	static final float PI = 3.14F;
	int rad;
	int x;
	int y;
	int under;
	int height;
	int radius;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 계산할 도형은? 1.원 2.사각형 3.삼각형 > ");
		int choice = sc.nextInt();
		
		//원
		if(choice == 1) {
			System.out.println("원의 넓이를 계산합니다");
			System.out.print("반지름을 입력하세요 > ");
			int rad = sc.nextInt();
			System.out.println(circle(rad));
			
			
			
		} else if(choice == 2) {
			System.out.println("사각형의 넓이를 계산합니다");
			System.out.print("가로 길이를 입력하세요 > ");
			int x = sc.nextInt();
			System.out.print("세로 길이를 입력하세요 > ");
			int y = sc.nextInt();
			System.out.println(square(x,y));
			
		} else {
			System.out.println("삼각형 넓이를 계산합니다");
			System.out.print("밑변 길이를 입력하세요 > ");
			int under = sc.nextInt();
			System.out.print("높이를 입력하세요 > ");
			int height = sc.nextInt();
			System.out.println(triangle(height, under));
			
			
		}
		
	}


	private static String triangle(int height, int under) {
		int res = under * height / 2;
		return "삼각형의 넓이는 " + res + " 입니다";
	}


	private static String square(int x, int y) {
		
		int res = x * y;
		return "사각형의 넓이는 " + res + " 입니다";
	}


	private static String circle(int rad) {
		
		int res = (int)(rad * rad * PI);
		
		return "원의 넓이는 " + res + " 입니다";
		
	}

	
}
