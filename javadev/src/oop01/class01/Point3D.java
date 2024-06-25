package oop01.class01;

public class Point3D extends Point2D{
	
	public Point3D() {
		this(10, 20, 30);
		System.out.println("Point3D() 실행중");
	}

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
		System.out.println("Point3D(x,y,z) 실행 중");
	}

	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("z : " + getZ());
	}
}
