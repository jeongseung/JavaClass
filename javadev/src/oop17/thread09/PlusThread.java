package oop17.thread09;

public class PlusThread extends Thread{
	MyData myData;

	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData(); //값을 1증가 시키기 위해 메서드 호출
		System.out.println(getName() + "실행 결과" + myData.data);
	}

	
}
