package day04;

public class Sachik {
	
	//����
	public void sum(int a,int b,int c) {	// �Լ��� �������� ()�� �־ ���� ����.
		System.out.println("���� "+(a+b+c));
	}
	//����
	public void sub(int a,int b) {
		System.out.println("���� "+(a-b));
	}
	//����
	public void mul(int a,int b,String c) {	// ������ Ÿ���� �������, ()�� ���� �� �ֵ��� ���� ����.
		System.out.println("���� "+(a*b));
		System.out.println(c);
	}
	//������
	public int div(int a,int b) {	// void�� ������ 0�̶�� �ǹ�. �׷��� �����ϰ�, ���ϵǴ� �������� ���� �°� ����.
		//System.out.println("������ ��: "+(a/b));
		//System.out.println("������ ������: "+(a%b));
		return a/b; // ()�� ���� ������ ����. ������� �ٽ� �����شٶ�� �ǹ�. 
	}
	
	public static void main(String[] args) {
		
		Sachik s1 = new Sachik();
		
		s1.sum(1,5,8);	// �ش� �޼��尡 ()�� �����Ǿ� �ִٸ�, ()�� �����͸� �Է��ϸ�, �� �����ͷ� ���.  
		s1.sub(2,10);
		s1.mul(3,4,"A");
	//	s1.div(4,10);
		
		System.out.println(s1.div(20, 4));	// �Լ������� �ٷ� ����.
	}

}
