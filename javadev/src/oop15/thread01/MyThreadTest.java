package oop15.thread01;

public class MyThreadTest {
	public static void main(String[] args) {
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);  // 일반 스레드(기본 디폴트)
		thread1.setName("일반쓰레드");
		thread1.start();
		
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);  //데몬 스레드
		thread2.setName("데몬쓰레드");
		thread2.start();
		
		//3.5초 후 main 쓰레드 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
		
	}
}
