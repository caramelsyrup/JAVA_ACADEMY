package day08;

interface InterTest{
	public  void test();
}
interface InterShap{	// ��� �߻��� �޼ҵ常 �ִٸ�, Interface��� �Ѵ�.
						// ���� �߻��� �޼ҵ���� abs�� ��� ������ �ȴ�.
						// �������̽��� new�� ������ ��ü ������ ���� �ʴ´�. abstract class�� ����.
	public  void draw();
	public  void move();
	public  void print();
}
class InterCircle implements InterShap, InterTest{	// interface�� �̿��Ϸ��� implements�� ����Ѵ�. extends�� ��Ӱ��踸.
													// interface�� �������� ����ü� �ִ�. ����� �ϳ��� ����.
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}
class Inter{
	public void interTest() {
		
	}
}
class InterRectangle extends Inter implements InterShap,InterTest {	// ����ϰ� ���� Ŭ������ �������� implements�ϴ� ���� ����.
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}
public class InterExam {
	
}
