package oop11.inner11;

public class ButtonTest {
	
	public static void main(String[] args) {
		//개발자 1. 클릭하면 음악재생
		Button btn1  = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자1 : 음악 재생");
			}
		});
		
		//개발자 2. 클릭하면 네이버 접속
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자2 : 네이버 접속");
			}
		});
	}
}
