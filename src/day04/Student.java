package day04;

public class Student {	// �л��̶�� Ŭ������ ����.
	int StudentID;	// �й�
	String name;	// �̸�
	int grade;		// �г�
	String address;	// �ּ�	-------------- �̰͵��� �Ӽ�(�������)
	
	// �����ϴ�. ��� ����. = ���� (�޼ҵ�)
	public void study() {
		System.out.println(name+" �����ϴ�");
	}
	public void play() {
		String a = name+address;
		System.out.println(name+" ���̸� �ϴ�");	// play��� �Լ�(�޼ҵ�)�� ����� ��¹��� ����.
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();	//s1�� 1���� ��ü���� �л��̰�, s1�� StudentŬ������ ������ �־� ����.
		s1.StudentID=100;	//StudentŬ�����̿��Ͽ� ���� ����. �̹� Student Ŭ�������� ������ ����� ������. ���µ� ����.
		s1.name="ȫ�浿";		//
		s1.grade=1;			//
		s1.address="�λ�";	//
		
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.name);
		s1.study();			// s1��ü�� �޼ҵ带 ����.study�� �̸� ����� ���� �޼ҵ���.
		
		Student s2	=	new Student();	// s2��� ���ο� ��ü�� ����.
		s2.StudentID=200;	//StudentŬ������ �̿��� ���� ����. 
		s2.name="�̼���";		//
		s2.grade=2;			//
		s2.address="����";	//
		
		System.out.println(s2.name);
		System.out.println(s2.address);
		
		// �̸� ������, 3�г�, ��õ, s3�� ����. �̸��� �ּ� ���.
		
		Student s3 = new Student();	// s3��� ���ο� ��ü ����.
		s3.StudentID=300;
		s3.name="������";
		s3.grade=3;
		s3.address="��õ";
		
		System.out.println(s3.name+" & "+s3.address);
		s3.study();
		
		// �л��� play()��� �Լ�(�޼ҵ�), �̸�+��Ѵ� ��� ���� ���.
		s1.play();
		s2.play();
		s3.play();
		
		
	}
}
