package day04;

public class PersonMain {

	public static void main(String[] args) {
		/*
		 * p1 �����
		 * �̸� �ּ� �Է�
		 * ȫ�浿 �����Ѵ�. ���.
		 */
		
		// �ٸ� Ŭ�������� ���� ���� ��ü�� �־ Ȱ�� ����.
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		p1.addr = "�λ�";
		p1.study();
		
		Person p2 = new Person("������","����");
		p2.study();
		System.out.println("--------------------------------------");
		
		Bank b = new Bank("���ڹ�",5000);
		b.stmoney();
		
		System.out.println("--------------------------------------");
		
		Baby baby = new Baby();
		baby.name = "��ֱ�";
		baby.age = 5;
		baby.smile();
		
		System.out.println("--------------------------------------");
		
		Baby baby1 = new Baby("��ư�");	// �����ڸ� �̿��� �ڵ�
		baby1.cry();
		
		System.out.println("--------------------------------------");
		
		Gugudan ten = new Gugudan(10);	// Gugudan Ŭ�������� �̹� �������.
		ten.viewData();
		
		System.out.println("--------------------------------------");
		
		
	}

}
