package oop25.reflection;

public class ReflectionTest4 {
	public static void main(String[] args) {
		Worker worker = new Worker("서태웅", Worker.POSITION_ASSISTANT);
		
		Class<?> cls = worker.getClass();
		try {
			Object obj = cls.getConstructor().newInstance(); //Object obj = new Worker();
			if(obj instanceof Worker) {
				System.out.println("Worker 클래스의 인스턴스입니다.");
			}
			System.out.println("worker.hashCode : " + worker.hashCode());
			System.out.println("obj.hashCode : " + obj.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
