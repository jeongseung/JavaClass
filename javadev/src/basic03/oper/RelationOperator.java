package basic03.oper;

public class RelationOperator {
	public static void main(String[] args) {
		System.out.println(5 < 2);
		System.out.println(5 > 2);
		System.out.println(5 < 5);
		System.out.println(5 <= 5);
		System.out.println(5 >= 5);
		System.out.println();
		
		//등가 비교
		//기본자료형 등가 비교
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println();
		
		//참조 자료형 등가 비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);

		
	}

}
