package day01;

public class Exam05 {

	public static void main(String[] args) {
		int a=49;
		// a�� 50���� ũ��
		
		if(a>50) {	//true
			System.out.println("50���� ũ��.");
		}else {	//false
			System.out.println("50���� �۴�.");
		}
		
		int b;
		b=a%2;
		// b ���� ����. ������ ���� ������ ����.
		if(b==0) {
			System.out.println("a�� ¦��");
		}else {
			System.out.println("a�� Ȧ��");
		}
		
		a=72;
		if(a%2==0) {
			System.out.println("a�� ¦��");
		}else {
			System.out.println("a�� Ȧ��");
		}
		
		//����if ���
		a=177;
		
		if(a<0) {
			System.out.println("a�� 0�̸�");
		}else if(a<100) {
			System.out.println("a�� 100�̸�");
		}else if(a<200) {
			System.out.println("a�� 200�̸�");
		}else if(a<300) {
			System.out.println("a�� 300�̸�");
		}else {
			System.out.println("a�� 300�̻�");
		}	// ���� ������ �� ����.
			// else�� ��������ν� ó��if�� ���������� ���� ��� �̾���� �ֵ��� ���� ����.
		
		if(a>300) {
			System.out.println("a�� 300�̻�");
		}else if(a>200) {
			System.out.println("a�� 200���� 299����");
		}else if(a>100) {
			System.out.println("a�� 100���� 199����");
		}else if(a>0) {
			System.out.println("a�� 0���� 99����");
		}else {
			System.out.println("a�� 0�̸�");
		}	// �������� ǥ��. �ڵ带 �д� �ڰ� ����� �ʵ���, ���� ���� �ȵȴ�.
		
		int c=100;
		if(c>=0 && c<100) {	//&&�� and�� �ǹ�. �� ������ ��� ���̾�� ���� �ȴ�.
			System.out.println("a�� 0���� 100�̸�");
		}if(c>=100 && c<200) {
			System.out.println("a�� 100���� 200�̸�");
		}if(c>=200 && c<300) {
			System.out.println("a�� 200���� 300�̸�");
		}if(c>=300) {
			System.out.println("a�� 300�̻�");
		}
		
		/*
		 * su��  0���� ũ�� ¦��
		 * su�� 0�̴�.
		 * su�� 0���� ũ�� Ȧ��
		 */
		int su=45;
		if(su>0) {
			if(su%2==0) {
				System.out.println("su�� 0���� ũ�� ¦��");
			}else {
				System.out.println("su�� 0���� ũ�� Ȧ��");
			}
		}else if(su==0) {
			System.out.println("su�� 0�̴�");
		}else {
			System.out.println("su�� 0���� �۴�");
		} // && ������ ���� �ʰ�, else�� if�� �ۼ�.
		
		su=0;
		if(su>0 && su%2==0) {
			System.out.println("su�� 0���� ũ�� ¦��");
		}if(su>0 && su%2==1) {	// su % 2 !==0 ���� ǥ������
			System.out.println("su�� 0���� ũ�� Ȧ��");
		}if(su==0) {
			System.out.println("su�� 0�̴�.");
		}	// &&�� �Ἥ if������ �ۼ�.
		

	}

}
