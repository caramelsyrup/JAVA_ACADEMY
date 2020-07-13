package day08;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 점프 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 합니다.");		
	
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 상급자 입니다. ***");
		
	}
	
	
}
