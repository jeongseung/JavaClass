package basic02.ex01;

public class DataType02 {
	public static void main(String[] args) {
		//float의 정밀도(대략 소수점 이하 7자리)
		float f1 = 1.000_000_1f;
		System.out.println(f1);
		
		
		float f2 = 1.000_000_01f;
		System.out.println(f2); //오차 발생
		
		//double의 정밀도(대략 소수점 이하 15자리)
		double d1 = 1.000_000_000_000_001;
		System.out.println(d1);
		
		double d2 = 1.000_000_000_000_000_1;
		System.out.println(d2);//오차 발생
		
		
	}
}
