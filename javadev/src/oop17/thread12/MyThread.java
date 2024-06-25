package oop17.thread12;

public class MyThread extends Thread{
	
	boolean yieldFlag;
	
	@Override
	public void run() {
		
		while(true) {
			if(yieldFlag) {
				Thread.yield(); //yieldFlag가 true면 다른 스레드에게 cpu 사용권을 양보
			} else {
				System.out.println(getName() + "실행");
				for(long i=0; i<1000000000L; i++) { //시간지연
					
				}
			}
		}
	}

}
