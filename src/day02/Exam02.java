package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * �ݾ��� �Է¹ޱ�.
		 * ���� ��� 52850�� �ϰ��, ����� ������ ���������°��� ���.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��ϼ���.>>");
		int amount = sc.nextInt();
		
		int five	= amount/50000;
		System.out.println("���������� "+five+"�� �Դϴ�.");
		
		int man	= ((amount/10000)-(five*5));
		System.out.println("�������� "+man+"�� �Դϴ�.");
		
		int cheon = (amount%10000)/1000;	// �������� Ȱ���� ���� ����. ������ �ٲ� Ȱ�밡��. (amount%10000)�� �̿��ؼ� �������� Ȱ��.
		System.out.println("õ������ "+cheon+"�� �Դϴ�.");
		
		System.out.println("-------------------------------------");
		
		if(five>0) {
			System.out.println("���������� "+five+"�� �Դϴ�.");
			System.out.println("�������� "+man+"�� �Դϴ�.");
			System.out.println("õ������ "+cheon+"�� �Դϴ�.");
		}else if(man>0){
			System.out.println("�������� "+man+"�� �Դϴ�.");
			System.out.println("õ������ "+cheon+"�� �Դϴ�.");
			}else {
			System.out.println("õ������ "+cheon+"�� �Դϴ�.");
			}
		sc.close();
	}

}
