package oop07.object;

class Point{
	
}

public class ObjctTest01 {
	public static void main(String[] args) {
		
		Point pt = new Point();
		System.out.println("클래스 이름 : " + pt.getClass());
		System.out.println("해쉬 코드 : " + pt.hashCode());
		System.out.println("인스턴스 참조값 : " + pt.toString());
		
		Point pt2 = new Point();
		System.out.println("클래스 이름 : " + pt.getClass());
		System.out.println("해쉬 코드 : " + pt.hashCode());
		System.out.println("인스턴스 참조값 : " + pt.toString());
		
		int a = 4;
		if(!(a!=1 && a!=2&& a!=3)) {
			System.out.println("저학년");
		}
	}
}
