package oop09.interface01;

public class SamsungTv implements TV {
	
	private HarmanSpeaker speacker;
	
	@Override
	public void setSpeaker(Speaker speaker) {
		this.speacker = speacker;
	}
	
	public void turnOn() {
		System.out.println("SamsungTV : TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("SamsungTV : TV를 끕니다");
	}
	public void channelUp() {
		System.out.println("SamsungTV : 채널을 올립니다");
	}
	public void channelDown() {
		System.out.println("SamsungTV : 채널을 내립니다");
	}
	public void soundUp() {
		if(speacker==null) {
			System.out.println("SamsungTV : 소리를 키웁니다");
			
		} else {
			speacker.soundUp();
		}
	}
	public void soundDown() {
		if(speacker==null) {
			System.out.println("SamsungTV : 소리를 줄입니다");
		} else {
			speacker.soundDown();
		}
	}

}
