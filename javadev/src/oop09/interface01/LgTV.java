package oop09.interface01;

public class LgTV implements TV{
	
	private Speaker speaker;

	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void turnOn() {
		System.out.println("LGTV : TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("LGTV : TV를 끕니다");
	}
	public void channelUp() {
		System.out.println("LGTV : 채널을 올립니다");
	}
	public void channelDown() {
		System.out.println("LGTV : 채널을 내립니다");
	}
	public void soundUp() {
		if (speaker==null) {
			System.out.println("LGTV : 소리를 키웁니다");
		} else {
			speaker.soundUp();
		}
	}
	public void soundDown() {
		if(speaker==null) {
			System.out.println("LGTV : 소리를 줄입니다");
		} else {
			speaker.soundDown();
		}
	}

}
