package basic07.method;

public class MethodTest02 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);
	}

	private static void print(int... arr) {  // 가변 인자
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

//	private static void print(int i, int j, int k) {
//		System.out.println(i + "\t" + j + "\t" + k);
//	}
//
//	private static void print(int i, int j) {
//		System.out.println(i + "\t" + j);
//	}
//
//	private static void print(int i) {
//		System.out.println(i);
//	}

}

