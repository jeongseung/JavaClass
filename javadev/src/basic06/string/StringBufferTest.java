package basic06.string;

public class StringBufferTest {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("실수란 ");
		sb.append("신을 용서하는 ");
		sb.append("인간의 행위이다");
		sb.insert(16, "자비로운 ");
		sb.delete(16, 21);
		sb.reverse();
		sb.reverse();
		
		printString(sb);

	}

	private static void printString(StringBuffer sb) {
		System.out.println(sb.length() + " : " + sb.capacity());
		System.out.println(sb);
	}
}
