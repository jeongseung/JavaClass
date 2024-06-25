package oop09.interface05;

public class LgRemoteTV extends RemoteTV{

	@Override
	public void channerDown() {
		System.out.println("RemoteTV : 채널을 내립니다");
	}
	
	public void soundUp() {
		System.out.println("소리를 키웁니다");
		
	}
	

}
