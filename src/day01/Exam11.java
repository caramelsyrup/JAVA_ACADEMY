package day01;

public class Exam11 {

	public static void main(String[] args) {
		
		int n1=5;
		int n2=++n1;	//++n1 이기에 n1에 1을 먼저 증가시킨후, n2에 1증가된 n1을 저장.
		System.out.println(n1);	//6
		System.out.println(n2);	//6
		System.out.println("====================");
		
		int n3=n1++;	// n1을 n3에 먼저 저장한 뒤에, 종료되면서 n1값이 1증가 된다.
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
