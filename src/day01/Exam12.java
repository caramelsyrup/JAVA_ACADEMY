package day01;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�ڹ� 2.�����ͺ��̽� 3.�ȵ���̵� 4.��Ÿ");
		System.out.println("�����ȣ ����>>");
		int num = sc.nextInt();
		
		String sub="";
	
		if(num==1) {
			sub="�ڹ�";
		}else if(num==2) {
			sub="�����ͺ��̽�";
		}else if(num==3) {
			sub="�ȵ���̵�";
		}else if(num==4) {
			sub="��Ÿ";
		}else {
			sub="";
		}
		System.out.println(sub+"����");
		
		switch(num) {	// �ݺ���.
			case 1: 
				System.out.println("�ڹٰ���"); break;	// break�� �ɾ ���� case�� ������� �ʵ��� ����.
			case 2: 
				System.out.println("�����ͺ��̽�����");break;
			case 3: 
				System.out.println("�ȵ���̵����");break;
			case 4: 
				System.out.println("��Ÿ����");break;
			default :
				System.out.println("��������");
		}
		sc.close();
	}

}
