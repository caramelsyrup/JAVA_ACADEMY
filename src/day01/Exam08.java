package day01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// ��,��,�� �Է¹ޱ�. ����, ���, ������ ���.
		// ������ 90�̻��� a����/80�̻��� b����/70�̻���c����/������ f����
		Scanner sc = new Scanner(System.in); 	
		// scanner �޼ҵ带 �̿��ϱ� ���ؼ� ����.
		System.out.print("�̸��� �Է��ϼ���.>>");
		String name = sc.next();
		
		System.out.print("���� ������ �Է��ϼ���.>>");
		int score = sc.nextInt();
		System.out.println("���� ���� : "+score);
		
		System.out.print("���� ������ �Է��ϼ���.>>");
		int score1 = sc.nextInt();
		System.out.println("���� ���� : "+score1);
		
		System.out.print("���� ������ �Է��ϼ���.>>");
		int score2 = sc.nextInt();
		System.out.println("���� ���� : "+score2);
		
		int total = (score+score1+score2);		
		System.out.println(name+"�� ������ "+total+"�Դϴ�.");
		
		
		int avg =total/3;
		System.out.println(name+"�� ����� "+avg+"�Դϴ�.");
		
		String grade = "";	// grade������ �����ؼ� ���ڿ��� �Է¹����� �ֵ���.
	
		if(avg>=90) {
			System.out.println(name+" A���� �Դϴ�.");
			grade="A����";
		}else if(avg>=80) {
			System.out.println(name+" B���� �Դϴ�.");
			grade="B����";
		}else if(avg>=70) {
			System.out.println(name+" C���� �Դϴ�.");
			grade="C����";
		}else {
			System.out.println(name+" F���� �Դϴ�.");
			grade="F����";
		}	// print������ �ݺ��Ǵ� ���ŷ����� ����.
		sc.close();
		System.out.println(grade);	// ������ ����ϸ� �Ǵϱ� print�� ��� �� �ʿ䰡 ����.
	}

}
