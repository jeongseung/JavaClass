package oop09.interface01;

public class HarmanSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("HarmanSpeacker : 볼륨을 키웁니다");
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeacker : 볼륨을 줄입니다");
		
	}
	
	

}
