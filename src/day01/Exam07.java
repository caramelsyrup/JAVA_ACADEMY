package day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		/*
		 * ������ �Է¹ް�
		 * ĿƮ������ �Է¹޾�
		 * �հ����� ���հ������� �Ǻ�
		 */
		System.out.print("ĿƮ������ �Է��ϼ���.>>");
		Scanner sc = new Scanner(System.in); // ���� ������ �Է��� �޴� ���̶��, ���� �޼��带 �ι� ������ �ʿ�� ����. �ϳ��� �ߺ��Ͽ� ����Ͽ��� ������ ���.
		int cut = sc.nextInt();
		System.out.println("ĿƮ������ "+cut+"��");		
//-----------------------------------------------------------------------------------
		System.out.print("������ �Է��ϼ���.>>>");
		int score = sc.nextInt();
		System.out.println("����� ������ "+score+"��");
		
		if(score>=cut) {
			System.out.println("����� �հ��Դϴ�.");
		}else {
			System.out.println("����� ���հ��Դϴ�.");
		}
		// ������ 3�� ������� �ƴ��� �Ǵ�
		
		if(score%3==0) {
			System.out.println(score+": 3�� ����Դϴ�.");
		}else {
			System.out.println(score+" : 3�� ����� �ƴմϴ�.");
		}
		sc.close();
		
		
	}

}
