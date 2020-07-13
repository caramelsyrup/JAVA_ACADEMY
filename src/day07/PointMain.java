package day07;

public class PointMain extends Point{
	
	private String color;
	
	public PointMain(int x, int y, String color) {
		 super(x, y);
		// super(); �� ���� ����ϰ� �ʹٸ�, �θ�Ŭ������ �����ڸ� ����Ʈ �����ڵ� �߰��϶�.
		// System.out.println(color); �ٷνᵵ ������, �������̵��� �̿�����.
		 this.color = color;
	}
	
/*	public void disp() {	//�������̵�. �̹� �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ�Ŭ�������� ����. ���⿡�� �޼ҵ���� �޶�����, ���ο� �޼ҵ带 ����°�.
		super.disp();		//�θ�Ŭ������ �����ϴ� �޼ҵ带 �ҷ���.
		System.out.println("Color : "+this.color);
	}
*/
	@Override		// ������ �Ҷ� �˷��ִ� ��, ���� �Ʒ��� �޼ҵ���� �޶����� �Ǹ� ������ ����.
	public void disp() {
		super.disp();
		System.out.println("Color : "+this.color); 
	}
	public static void main(String[] args) {
	
		PointMain pm = new PointMain(4,5,"Yellow");
		pm.disp();	// �θ� Ŭ������ Point���� ���ǵ� �޼ҵ带 ���.
		pm.move(10,20);
		pm.disp();
		System.out.println(pm.str);
	}

}
