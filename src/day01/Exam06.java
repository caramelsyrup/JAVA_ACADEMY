package day01;

import java.util.Scanner;	
// java util�� �ִ� Scanner�� ���� ��Ű���� Ŭ������ �����´�.

public class Exam06 {

	public static void main(String[] args) {
		/*System.out.println("���� �Է��ϼ��� >>");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt(); 
		// nextInt���� �޾ƿ� ���� sc�� �ԷµǾ� �޼ҵ尡 ����ϵ��� �ϰ�, ��ɵǾ��� ����� ���� su�� ����.
		
		System.out.println(su);
		// �Է��� int���� �����ϴ�. nextInt�̱⿡.
		
		if(su%2==0) {
			System.out.println(su+"¦��");
		}else {
			System.out.println(su+"Ȧ��");
		}*/
		
		/*
		 * ���̸� �Է¹޾� ���̰� 20�̻��̸� ���尡��
		 * 15�� �̻� 20�� �̸� �θ�԰� ��������
		 * 15���̸� �̸� ���� �Ұ���
		 */
		System.out.print("���̸� �Է��ϼ���.>>");
		Scanner a = new Scanner(System.in);
		int A = a.nextInt();
		
		System.out.print(A+" �� : ");
		
		if(A<15) {
			System.out.println("����Ұ���");
		}if(A>=15 && A<20) {
			System.out.println("�θ�԰� ���� ����");
		}else {
			System.out.println("���尡��");
		}
		
		if(A>20) {
			System.out.println("���尡��");
		}else if(A>=15) {
			System.out.println("�θ�԰� ���� ����");
		}else {
			System.out.println("����Ұ���");
		}
		a.close();
	}

}
