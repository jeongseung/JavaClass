package oop09.interface05;

public abstract class RemoteTV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Remote TV 전원을 켭니다");
	}

	
	@Override
	public void powerOff() {
		System.out.println("Remote TV 전원을 끕니다");
	}

	@Override
	public void channelUp() {
		System.out.println("Remote TV 채널을 올립니다.");
		
	}	
}
