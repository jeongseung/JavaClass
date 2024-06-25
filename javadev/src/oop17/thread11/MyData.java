package oop17.thread11;

public class MyData {
	synchronized void abc() { //this : 메서드 동기화
		for(int i=0; i<3; i++) {
			System.out.println(i+"sce");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	synchronized void bcd() { //this : 메서드 동기화 
		for(int i=0; i<3; i++) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	void cde() { //this : 블록 동기화
//		synchronized (this) {
//			for(int i=0; i<3; i++) {
//				System.out.println(i+"번째");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//				}
//			}
//		}
		
		synchronized (new Object()) { //Object :블록 동기화
			for(int i=0; i<3; i++) {
				System.out.println(i+"Object번째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	
}

