package day01;

public class Exam11 {

	public static void main(String[] args) {
		
		int n1=5;
		int n2=++n1;	//++n1 �̱⿡ n1�� 1�� ���� ������Ų��, n2�� 1������ n1�� ����.
		System.out.println(n1);	//6
		System.out.println(n2);	//6
		System.out.println("====================");
		
		int n3=n1++;	// n1�� n3�� ���� ������ �ڿ�, ����Ǹ鼭 n1���� 1���� �ȴ�.
		System.out.println(n1); //7
		System.out.println(n3);	//6
		System.out.println("====================");
		
		int num1=7;
		int num2=--num1;
		int num3=num1--;
		System.out.println(num1);//6	5
		System.out.println(num2);//6	6
		System.out.println(num3);//		6
		System.out.println("====================");
		
		int a=50,b=3;
		int c;
		a++;
		++b;
		c=a++ + ++b;
		
		System.out.println(a);	// 52
		System.out.println(b);	// 5
		System.out.println(c);	// 56
		System.out.println("====================");
		
		int aa=10 , bb=3;
		int cc;
		--aa;	// 9
		bb++;	// 3->4
		cc=--aa + bb++;	// 8 + 4 = 12 , a=8 , b=5
		System.out.println(aa);	// 8
		System.out.println(bb);	// 5
		System.out.println(cc);	// 12
		System.out.println("====================");
		
		
	}

}
