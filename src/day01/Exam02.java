package day01;

public class Exam02 {

	public static void main(String[] args) {
		// ���� �ּ�.
		/* ������ �ּ��Դϴ�.
		 * ���� age�� �����ϰ� �ڽ��� ���̸� �Ҵ� 
		 * ���ڿ� name �� �����ϰ� �ڽ��� �̸��� �Ҵ�
		 * ȫ�浿�� ���̴� 20���Դϴ�. �� ���
		 */
		
		int age = 20;	// ������ int
		System.out.println(age);
		
		char A = 'a';	// ���ڴ� char
		System.out.println(A);
		
		String name = "ȫ�浿"; // ���ڿ��� String
		System.out.println(name);
		
		System.out.println(name+"�� ���̴� "+age+"�� �Դϴ�." );
		
		age = 40;
		name = "ȫ�ƹ���";
		
		System.out.print(name+"�� ���̴� "+age+"�� �Դϴ�." );	// ������ �����ϸ�, ��ȭ�ϴ� ���� ����.
		
	}

}
