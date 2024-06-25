package oop17.thread12;

public class ThreadStateTest1 {
	public static void main(String[] args) {
		Thread.State state; //Thread.State는 static enum
		
//		Thread.State[] ts = Thread.State.values();
//		for(Thread.State s : ts) {
//			System.out.println(s);
//		}
		
		Thread myThread = new Thread() {

			@Override
			public void run() {
				for(long i=0; i<1000_000_000L; i++) {} //시간지연
			}
		};
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//2.myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//3.myThread 종료
		try {
			myThread.join();
		} catch(InterruptedException e) {
		}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
	}

}
