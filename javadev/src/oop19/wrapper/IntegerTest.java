package oop19.wrapper;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i = 10; // 오토박싱(auto boxing) Integer i = Integer.valueOf(10);
		System.out.println(i);
		int n = i; //오토 언박싱(auto unboxing)
	}
}
