package day01;

public class Exam03 {

	public static void main(String[] args) {
		// ���� a 132�Ҵ�
		// ���� b 20�Ҵ�
		// ����, �E��, ����, ������ ��� �� ���.
		// int = 4����Ʈ = 32��Ʈ
		// long = 8����Ʈ
		// �Ǽ����� , double = 8����Ʈ , float = 4����Ʈ
		// �������� , char
		// 
		
		int a; 
		a=132;
		int b; 
		b=20;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("���� : "+(a+b));
		System.out.println("���� : "+(a-b));
		System.out.println("���� : "+(b-a));
		System.out.println("���� : "+(a*b));
		System.out.println("������ : "+(a/b));
		System.out.println("������ : "+(b/a));	 // ������ ���� �����̱⿡, �Ҽ����� ���õȴ�.
		System.out.println("������ : "+(a%b));
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"%"+b+"="+(a%b));
		
		long c = 100000000000L; // int�� �ڵ����� ���� �Ǿ� �ֱ⿡, long���� ������ ��ġ�� L�� ���δ�. ������ ��ȯ.
		
		float d=2.53f;	// f�� �ٿ��� ������ ��ȯ.
		double e=3.258;	// double�� �ڵ�, �⺻ ����.
		char ch = 'a';	// �������� ����.
		
		System.out.println(c+d+e+ch);
	}

}
