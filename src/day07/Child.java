package day07;

public class Child extends Father {	// �ڹٴ� ���� ��Ӹ� ����. ���� ����� �Ұ���.
	
	public Child() {
		super();	// �θ�Ŭ���� ������ �߿��� �Ű������� �ԷµǴ� ���� ���� ���. ������ �����ѵ�, ����Ʈ ������ ȣ��. ����Ʈ ������ ����, �ٸ��� �ִٸ� ����.
					// �θ�����ڸ� ������ ���� ȣ��
		System.out.println("�ڽ� ������");
	}
	
	public void childPrint() {
		System.out.println(super.str); // super. �ؼ� �θ�Ŭ������ ������ ���� ����.
		System.out.println("child print method");
	}
	public void grandPrint() {
		System.out.println("�Ҿ���� grandPrint method�� ���̰� ���� ����.");
	}
	
	public void test() {
		System.out.println("test method");
	}


}
