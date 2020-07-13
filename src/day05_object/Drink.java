package day05_object;

public class Drink {
	
	String name;
	int price;
	int ea;
	// �������� ����.
	public Drink(String name, int price, int ea ) {
		
		this.name = name;
		this.price = price;
		this.ea = ea;
	}	// ������ ����. �ԷµǴ� �Ű��������� ���� �Ҽ� �ֵ��� ����.
	
	public Drink(){
	
	} // ������ ����Ʈ �� ����. �����ڸ� �̿����� �ʰ�, ������ ���� �����ϸ鼭, �ڵ带 �ۼ��� ��쵵 �ֱ⿡.
	
	public void getData() {
		System.out.println(name+" "+price+" "+ea+" "+price*ea);
		System.out.println(name+" "+getTotal());
	}	// ���� ���� ���� �޼ҵ� ����. ���� ���.
	
	public int getTotal() {
		return price*ea;
	}	// int���� ���ϰ����� ���� �� �ִ� getTotal �Լ� ����.
		// �Ǵ� ����� ��ü�� ������ �����ؼ� �� ���� ����.

	
}
