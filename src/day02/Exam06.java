package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
	/*
	 * 1~10���� ��
	 * 11~20���� ��
	 * ....10���� ��	���
	 */
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println((i-9)+"����"+i+"���� �� : "+sum);
				sum=0;	// �ʱ�ȭ�� �ؼ� ���� �� ����� ���ְ� ���� ������ �� ����� ����� �� �ֵ��� ��.
			}
			
		}
		/*
		 * �л����� ���ٿ� ���� �л� ���� �Է¹�������.�׸��� ���.
		 *	��ġ���� ���. ���� �ο��� �Է¹޾ƾ���.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л����� �Է��ϼ���>>>");
		int a = sc.nextInt();
		
		System.out.print("���� �ο��� �Է��ϼ���.>>");
		int b = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.print(i+"\t");
			if(i%b==0) {
				System.out.println();
			}
		}
		System.out.println();
		// �� �������� ���.
		int row = (a/b);
		if((a%b)==0) {
			System.out.println(row+" �� �Դϴ�.");
		}else {
			System.out.println(row+1+" �� �Դϴ�.");
		}
		// ���� ������ �ϳ� �� �����Ͽ�, ��¹��� ����ϰ� �ۼ��ص� ��.
		
		//���׿�����(���ǿ�����)
		int r=((a%b)==0)? (a/b) : (a/b)+1 ; // r�� ����? ���ϋ� : �����϶�;
			System.out.println(r+" �� ����");
		
		sc.close();
	}

}
