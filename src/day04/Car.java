package day04;

public class Car {
	String carKind;
	String carColor;
	int speed;
	
	public Car(String carColor,String carKind) {	// �����ڴ� �ݵ�� Ŭ������� ����. void ���� ���̸�, �޼ҵ尡 �ǹ����⿡, ���� �ʴ´�.
		this.carColor=carColor;
		this.carKind=carKind;
	}
	//����Ʈ ������ => ������ �����ϴ�. ������ �̹� �ٸ� �����ڰ� �����Ҷ��� ���� �Ұ���.
	//�����ε�
	public Car() {
		
	}	// �ƹ��͵�  �Է����� �ʴ� ����.
	
	  public int speedUp (int a) {	// �ش� ������ �ٸ� ������ ���� �ʴ´ٸ�.
		// System.out.println("�ӵ� : "+ a );
		speed=a;
		return a;					// �ش� �޼ҵ忡 ���� ���� ��, �װ��� ���� �����.
	}
	
	
	//public void speedUp (int speed) {	// �ش� ������ �ٸ� ������ ���� �ʴ´ٸ�. void
	//		this.speed	=	speed;	
	//	}
		
	
	public void stop () {
		speed=0;
	}
	
	public void speedDown (int speed) {	// �ش� ������ �ٸ� ������ ���� �ʴ´ٸ�. void
		this.speed	=	speed;	// �ԷµǴ� ���� ����Ǵ� ������ �̸��� �����ϰ� ���. ��� ����Ǵ� ������ ��Ȯ�� �����ϱ� ���� this.�� ���.
	}
	
	public static void main(String[] args) {
		Car mycar = new Car();	// mycar��� ��ü ����. Car Ŭ������ ������
		mycar.carKind="�ҳ�Ÿ";
		mycar.carColor="���";
		mycar.speedUp(100);
		System.out.println("�ӵ� : "+mycar.speed);
		mycar.stop();
		System.out.println("�ӵ� : "+mycar.speed);
		
		Car c1 = new Car();
		c1.carColor="������";
		c1.carKind="��ī";
		c1.speedUp(80);
		System.out.println("�ӵ� : "+c1.speed);
		c1.speedDown(50);
		System.out.println("�ӵ� : "+c1.speed);
		
		System.out.println(c1);		// day04.Car@15db9742 �ش� �ּҿ��� 
		System.out.println(mycar);	// day04.Car@6d06d69c �ش� �ּҿ���
		// �׷��� �̰��� �ּҰ��̶�� �ϰ�, ���۷��� ������� �Ѵ�.
		// ��ü���� �ش� �Ӽ�,�Լ� ������ ���� ��� ����. ��ü���� �Ӽ�,�Լ��� �����ϴ� ���� �ƴ�. ���� �޸𸮿� ���� �����.
		
		Car c2 = new Car("����","����");	// c2��ü�� ����鼭 CarŬ������ �ʱⰪ�� ����.
		System.out.println(c2.carColor);
		
	}
	
}
