package OOP02.modifier;

public class PointTest {
	public static void main(String[] args) {
		Point2D pt= new Point2D();
		pt.x = 100; //같은 패키지이지만 private으로 막혀있어서 접근 불가
		pt.y = 100;
		System.out.println(pt.x);
	}
}