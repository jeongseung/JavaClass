package oop09.interface01;

public class AppleTV implements TV{

	@Override
	public void turnOn() {
		System.out.println("apple tv 켭니다" );
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("apple tv 끕니다");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("apple tv 채널 올립니다");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("apple tv 채널 내립니다");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("apple tv 소리 키웁니다");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("apple tv 소리 내립니다");
	}


	

}
