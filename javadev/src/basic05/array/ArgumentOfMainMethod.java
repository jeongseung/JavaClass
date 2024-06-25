package basic05.array;

public class ArgumentOfMainMethod {
	//args 배열 길이 구하기
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println();
		
		//입력매개변수 출력 1
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//입력매개변수 출력 2
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println();
	}

}
