package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//�ִ밪�� �ִ밪 ��ġ�� ���϶�. 
		int[] data = {10,5,90,100,250,30,77,88};
		int max=data[0];
		int maxPos = 0;
		int sum = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i]>max) {
				max=data[i];
				maxPos=i+1;
			}
			sum+=data[i]; // for���� �迭�� ���� ��ü���� �ݺ��ϱ⿡, ��ġ�� �迭 ���� ������Ų��.
		}
		System.out.println("�ִ밪�� "+max);
		System.out.println("��ġ�� "+maxPos);
		System.out.println("�迭�� �հ�� "+sum);
		System.out.println("�迭�� ��� "+(float)sum/data.length);	// int�� �����͸� float������ ���� ��ȯ.
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.>> ");
		int a = sc.nextInt();
		boolean j = false;	// true�� false�� �����ϴ� ������ ����.
		for(int i=0; i<data.length; i++) {
			if(data[i]==a) {
				System.out.println("�Էµ� �� "+a+" : "+(i+1)+" ����");
				j=true;
			}
		}
		if(j==false) {
				System.out.println("ã�� �� "+a+"�� ����");
		}
		
		
		
	}
}
