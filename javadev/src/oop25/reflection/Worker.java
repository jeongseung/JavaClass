package oop25.reflection;

public class Worker {
	
	public static final int POSITION_MANAGER = 0;
	public static final int POSITION_ASSISTANT = 1;
	public static final int POSITION_EMPLOYEE = 2;
	
	// alt + shift + a 여러 줄 한번에
	private String name;
	private int position;
	
	
	public Worker() {
		name = null;
		this.position = Integer.MAX_VALUE;
	}
	
	
	public Worker(String name, int position) {
		super();
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", position=" + position + "]";
	}
}
