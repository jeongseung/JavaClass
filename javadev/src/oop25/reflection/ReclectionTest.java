package oop25.reflection;

public class ReclectionTest {
	public static void main(String[] args) {
		Worker worker = new Worker("정승우", Worker.POSITION_ASSISTANT);
		System.out.println(worker);
		
		Class cls1 = worker.getClass();
		
		Class cls2 = Worker.class;
		
		Class cls3 = null;
		try {
			cls3 = Class.forName("oop25.reflection.Worker");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("cls1.hashCode : " + cls1.hashCode());
		System.out.println("cls2.hashCode : " + cls2.hashCode());
		System.out.println("cls3.hashCode : " + cls3.hashCode());
	}
}
