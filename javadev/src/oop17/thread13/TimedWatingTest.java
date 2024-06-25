package oop17.thread13;

public class TimedWatingTest {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("MyThread State =" + myThread.getState());
		try {
			Thread.sleep(100); //스레드 시작 준비
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread State =" + myThread.getState());
		
		myThread.interrupt(); //TIMED_WAITING -> RUNNABLE 상태 전환
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThread State =" + myThread.getState());
	}
}
