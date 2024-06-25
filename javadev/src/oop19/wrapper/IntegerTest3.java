package oop19.wrapper;

public class IntegerTest3 {
	public static void main(String[] args) {
		Integer a1 = Integer.valueOf(127);
		Integer a2 = Integer.valueOf(127);
		System.out.println(a1 == a2);
		System.out.println("equals = " + a1.equals(a2));
		
		Integer b1 = Integer.valueOf(128);
		Integer b2 = Integer.valueOf(128);
		System.out.println(b1 == b2); //-128~127은 자주 사용해서 미리 만들어놓고 사용하는데 128은 범위에 없어서 객체를 따로 만들기 때문에 false가 찍힘
		System.out.println("equals = " + a1.equals(a2));
	}
}
