package day02;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// �Է� �� ���� ������ŭ �Է�.
		// �� ������ �� ���.
		
		Scanner sc= new Scanner(System.in);
	
		System.out.print("���� ������ �Է��ϼ���.>>");
		int a = sc.nextInt();
		
		System.out.print("�����͸� �Է��ϼ���.>>");
		
		int sum = 0;
		
		for(int i=0; i<a; i++) {
			int datainput = sc.nextInt();	// ��ĵ �ż��带 Ȱ���� ���� ������ for���ȿ����� ����.
			sum+=datainput;					// ���� ������ ���꿡 Ȱ��.
		}
		System.out.println("������ �հ� : "+sum);
		
		sc.close();
	}

}
