package day04;

import java.util.Scanner;

public class Baby {
	
	String name;
	int age;
	
	public Baby(String name) {	// PersonMain���� �����ڸ� �̿��ϱ⿡, BabyŬ�������� ������ش�.
		this.name = name;		// �ԷµǴ� ���� ������ �ִµ�, name���� �����ϱ⿡, this.���� ������ ������ �ش�.
	}
	
	public Baby() {	// �����ڸ� �̿����� ���� ���� �ֱ⿡, ����Ʈ �����ڸ� ������ش�.
	}
	
	// ���´�
	public void smile() {
		System.out.println(name+"��(��) ���´�.");
	}
	//���
	public void cry() {
		System.out.println(name+"��(��) ���.");
	}
//------------------------------------------------------------------------------------------------	
	public static void main(String[]args) {
		// Baby ��ü b1�� �����
		// �̸�, ����, ���´�. ��
		Scanner sc = new Scanner(System.in);
		
		
		Baby b1 = new Baby();	// b1 BabyŬ������ ��ü�� ����. BabyŬ������ ���� ����.
		b1.age=2;
		b1.name="�ư�";
		
		System.out.print(b1.age+"�� ");
		b1.smile();
		
		Baby b2	= new Baby();
		b2.age=1;
		b2.name="�ֱ�";
		
		System.out.print(b2.age+"��"+" ");
		b2.cry();
		System.out.println();
		System.out.println("������ �̸��� �Է��ϼ���.");
		
		String Name = sc.next();
		Baby b3 = new Baby(Name);
		b3.cry();
		
	}

}
