package oop09.interface01;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.random.RandomGenerator.LeapableGenerator;

/*
 	MarshallSpeacker를 LGTV에 연결 후 테스트
 */
public class TvUser {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop09/interface01/product.properties"));
		String tvName = prop.getProperty("tv");
		//클래스 객체를 얻는다 -> Class 클래스는 생성자를 감추고있어 new로 생성할 수 없고 정적 메소드인 class.forName()을 사용해야한다
		
		Class tvClass = Class.forName(tvName);
		System.out.println("tvName : " + tvName);
		System.out.println("tvClass : " + tvClass);
		//객체 생성
		TV tv = (TV) tvClass.getConstructor().newInstance();		
		
		String speakerName = prop.getProperty("speaker");
		
		Class speakerClass = Class.forName(speakerName);
		Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();
		tv.setSpeaker(speaker);
		
		
//		TV tv = new LgTV();
		tv.turnOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}
}
