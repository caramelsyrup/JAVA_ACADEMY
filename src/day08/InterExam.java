package day08;

interface InterTest{
	public  void test();
}
interface InterShap{	// 모두 추상적 메소드만 있다면, Interface라고 한다.
						// 따라서 추상적 메소드들의 abs를 모두 날려도 된다.
						// 인터페이스도 new로 새로이 객체 생성이 되지 않는다. abstract class와 같이.
	public  void draw();
	public  void move();
	public  void print();
}
class InterCircle implements InterShap, InterTest{	// interface를 이용하려면 implements를 사용한다. extends는 상속관계만.
													// interface는 다중으로 끌어올수 있다. 상속은 하나만 가능.
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}
class Inter{
	public void interTest() {
		
	}
}
class InterRectangle extends Inter implements InterShap,InterTest {	// 상속하고 상위 클래스에 다중으로 implements하는 것은 가능.
	public void draw() {}
	public void move() {}
	public void print() {}
	public void test() {}
}
public class InterExam {
	
}
