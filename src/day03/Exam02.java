package day03;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 1~10���� ��
		 * 11~20���� ��
		 * 91~100���� ��
		 * ���� for������
		 */
		 int sum = 0;
		for(int i=1; i<=100; i+=10) {
			//int sum=0;
			for(int j=i; j<(i+10); j++) {
				sum+=j;
			}
			System.out.println(i+"����"+(i+9)+"������ �� :"+sum);
			sum=0;
		}

	}

}
