package day08;

public class AbsShapeMain {
	public static void main(String[] args) {
		AbsCircle ac = new AbsCircle();
		ac.draw();
		ac.move();
		
		AbsShape as = new AbsSquare(); // 추상클래스가 상위 클래스이기에 객체 as에 AbsSquare가 저장 가능. 
		as.draw();
		as.move();
		
		// AbsShape ad = new AbsShape(); 추상 클래스이기에, 객체를 생성할 수 없음.
			
	}
	
}
