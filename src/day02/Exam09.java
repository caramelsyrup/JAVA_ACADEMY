package day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// ���� �Է��϶�. �������� -1�� �Է��ϸ� ����.
		// �ӷ��� ���� �հ�� ����� ���Ͻÿ�.
		// ��) 10 5 6 9 -1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���.>>");
		
		int sum=0;		// �ԷµǴ� a���� ������ų ����.
		int cnt=0;		//�Է��� ���� ����
		while(true) {	// while���� ������ true�� �ۼ��Ͽ�, �׻� �۵��ǵ��� ����.
			int a = sc.nextInt();
			if(a==-1) 
				break;	// -1�� �ԷµǸ� while���� ���⼭ �����. �׷��� cnt++�� �߰��� ���� ����.
			sum+=a; 	// sum�� �ԷµǴ� a���� ������Ŵ.
			cnt++;		// cnt�� a�� �Է� Ƚ���̱⿡, �Է¹� ���Ŀ� 1����.
		}
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+(sum/cnt));
		

	sc.close();	
	}

}
