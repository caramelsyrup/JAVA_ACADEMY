package day01;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		/*
		 * swich �� ����Ͽ�, ���� Ǯ��
		 * ù��° �� �Է�
		 * �ι�° �� �Է�
		 * ������ �Է�
		 * ��� : ���� ���
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù���� ��>>");
		int a = sc.nextInt();
		
		System.out.print("ù���� ��>>");
		int b = sc.nextInt();
		
		System.out.print("������>>");
		String c = sc.next();
		
		/*switch(c) {
		
			case "+" :
				System.out.println("���� : "+(a+b));	
				break;
			case "-" :
				System.out.println("����  : "+(a-b));	
				break;
			case "*" :
				System.out.println("���� : "+(a*b));	
				break;
			case "/" :
				System.out.println("������ : "+(a/b));	
				break;	
			case "%" :
				System.out.println("������ : "+(a%b));	
				break;	
			default :
				System.out.println("������ ����");
				break;
		}*/
		
		// ����if��
		// ���ڿ� �񱳽äĴ� equals()�� ���. equals �޼ҵ带 �̿�.
		if(c.equals("+")) {	
			System.out.println("���� : "+(a+b));
		}else if(c.equals("-")) {
			System.out.println("����  : "+(a-b));
		}else if(c.equals("*")) {
			System.out.println("����  : "+(a*b));
		}else if(c.equals("/")) {
			System.out.println("������ : "+(a/b));	
		}else if(c.equals("%")) {
			System.out.println("������ : "+(a%b));	
		}else {
			System.out.println("������ ����");
		}
	sc.close();	
	}

}
