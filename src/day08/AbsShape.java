package day08;

public abstract class AbsShape {	// draw, move �޼ҵ带 ��üȭ �ϱ� ��Ʊ⿡, �� Ŭ������ �߻�ȭ.
	// �׸���. �̵��ϴ�.
	
	void print() {
		System.out.println();
	}
	
	abstract void draw();
	
	abstract void move();
}
