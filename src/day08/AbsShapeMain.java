package day08;

public class AbsShapeMain {
	public static void main(String[] args) {
		AbsCircle ac = new AbsCircle();
		ac.draw();
		ac.move();
		
		AbsShape as = new AbsSquare(); // �߻�Ŭ������ ���� Ŭ�����̱⿡ ��ü as�� AbsSquare�� ���� ����. 
		as.draw();
		as.move();
		
		// AbsShape ad = new AbsShape(); �߻� Ŭ�����̱⿡, ��ü�� ������ �� ����.
			
	}
	
}
