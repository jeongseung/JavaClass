package basic02.ex01;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		System.out.println(2 - 1.1);
		
		BigDecimal bd1 = new BigDecimal("2");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));
	}

}
