package day07;

public class Main {

	public static void main(String[] args) {
		
		
		Father f1 = new Father(); // �ƹ��� ������ ���.
		// f1.fatherPrint();	
		
		System.out.println();
		
		Child c1 = new Child();	 // �ƹ��� �����ڰ� �߰��� �ڽĻ����� ���. �ƹ��� Ŭ������ ��ӹޱ⿡.
		// c1.childPrint();	
		System.out.println();
		
		GrandFather g1 = new GrandFather(); // ����� ������ �� ����.
		
		System.out.println();
		
		f1.methodTest();
		f1.grandPrint();
		c1.methodTest();
		c1.grandPrint();// Child Ŭ������ GrandFatherŬ������ ����� �޾ұ⿡, GrandFatherŬ������ �޼ҵ� ��� ����.
		
		GrandFather g2; // ���� �� ��. ������ ���� ����.
		Father f2 = new Father();
		g2 = f2; // GrandFather = Father, ��Ӱ����̱⿡ ��������, ���� ����ȯ�� �����ϴ�. f2=(Father)g2 ����.
		
		g2.grandPrint();// GrandFather Ŭ������ �޼ҵ常 �̿밡��. ������ �ش� �޼ҵ尡 �������̵� �Ǿ��ٸ�, �������̵� �� �޼ҵ尡 ����.
						// Father Ŭ�������� �ش� �޼ҵ带 �������̵� ������, ���� ������ Father�� ������ ��.
	
		GrandFather g3 = new Father(); // ������ FatherŬ�������� ó�� ������� �޼ҵ���� ����Ҽ� ����.
	}

}
