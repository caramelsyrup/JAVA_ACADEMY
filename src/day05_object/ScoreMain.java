package day05_object;

import java.util.Scanner;

public class ScoreMain {	// ������ ���� ȭ��.
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();	// Teacher Ŭ������ t1��ü ����.
		while(true) {	// �׻� ���� ���� �༭ �׻� ����.
			t1.showMenu();	// �ʱ�ȭ���� �ߵ��� ����.
			int num = sc.nextInt(); // ��� �Ǵ��� ���ؼ� ���� ����.
			switch(num) {
			
				case 1: t1.inputData(); break;	// 1�̸� �Է�
				case 2: t1.viewData(); break;	// 2�̸� ������ ����
				case 3: System.out.println("����");	// 3�̸� ����
						System.exit(0);			// ���α׷� ����.
				default : System.out.println("�Է¿���");	// �������� �Է¿���, �ٽ� ����.
			}
			
		}
	}

}
