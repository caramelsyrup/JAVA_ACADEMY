package day01;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99���� ������ �Է��ϼ���>>");
		
		int a = sc.nextInt();
		int b= a/10;	// a�� 10���� ��
		int c= a%10;	// a�� 1���� ��

		
		if((b==3||b==6||b==9) && (c==3||c==6||c==9)) {
			System.out.println("�ڼ� ¦¦");
			System.out.println("�ڼ� ¦");
		}else if(b==3||b==6||b==9 ) {
			System.out.println("�ڼ� ¦¦");
		}else if(c==3||c==6||c==9) {
			System.out.println("�ڼ� ¦");
		}else {
			System.out.println("�ڼ� ����");
		}
		
		/* int cnt = 0;
		 * if a�� 3���� ���������� �������� 0�� ���ǿ� ������ 1���� cnt = cnt+1;
		 * if b�� 3���� ���������� �������� 0�� ���ǿ� ������ 1���� cnt = cnt+1;
		 * if cnt ���� 1���� 2������ ���� ��¹��� ���� �ۼ�.
		 * �ϴ����� 0�� 10,20,30���� ��� ������ , a���ǽĿ��� a!=0 , b���ǽĿ��� b!=0�� �߰����ش�.
		 */
		
		int cnt = 0;
		if(b!=0 && b%3==0) {
			cnt++; //cnt+=1; //cnt=cnt+1;
		}
		if(c!=0 && c%3==0) {
			cnt++; //cnt+=1; //cnt=cnt+1;
		}
		if(cnt==2) {
			System.out.println("�ڼ� ¦¦");
		}else if(cnt==1) {
			System.out.println("�ڼ� ¦");
		}else {
			System.out.println("�ڼ� ����");
		}
		
		sc.close();
	}

}
