package day01;

public class Exam04 {

	public static void main(String[] args) {
		// ������  r�� 5�� ����.
		// ���� ���̸� ����Ͻÿ�.
		// �������� 3.14
		
		int r;
		r=5;
		System.out.println(r);
		
		double rr;
		rr=5;
		System.out.println(rr);
		
		double R;
		R=3.14;
		System.out.println(R);
		// final double �� �����ϸ�, �ش� ������ ���� ������ų�� ����. ���� �빮�ڷ� ���� ǥ��. ���Ŀ� �ش� ������ ���� ������Ű�� ������ ��.
		// final double PI = 3.14; �� ����.	
		
		double A;
		A = r*r*R;
		
				System.out.println(A);	
				System.out.println(rr*rr*R);	// double������ ����
				System.out.println("���� ���̴� "+(r*r*R));	// int�� double�� ��� ����. ����� �Ǽ����� double.
				
		float f=5.0f;	// 4����Ʈ
		int num=10;		// 4����Ʈ
		f=num;	// java������ �Ǽ��� float > ������ int. �ڵ����� ����ȯ�� �̷�����.
		System.out.println("f:"+f);
		
		num=(int)f; // float���� int������ ����ȯ. ����� ����ȯ. �ڵ��� �ƴ� ���������� �̷����.
		
		long num1=100L;
		f=num1;	// float=long . �뷮�� long���� �� ũ����, java������ �Ǽ����� ���������� �� ���� ������ ����.
		
		
		
	}

}
