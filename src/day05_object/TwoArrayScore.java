package day05_object;

import java.util.Scanner;

		// �迭 ����.
public class TwoArrayScore {
	static Scanner sc = new Scanner(System.in);
	int [][] arr = new int[50][7];
	int row	=	0;
	
	public void showMenu() {		
		System.out.println("�����ϼ���.>");
		System.out.println("1.�����Է�.>");
		System.out.println("2.��ü���� ����.>");
		System.out.print("����>>");
		
	}	//  �ʱ� �޴� ���� ȭ���� ����.
	
	public void inputData() {
		System.out.println("�����Է� ����");
		System.out.println("�й�");
		int yearNum = sc.nextInt();
		
		System.out.println("����");
		int kor = sc.nextInt();
		
		System.out.println("����");
		int eng = sc.nextInt();
		
		System.out.println("����");
		int math = sc.nextInt();
		
		arr[row][0]	=	yearNum;	// �й�
		arr[row][1]	=	kor;		// ����
		arr[row][2]	=	eng;		// ����
		arr[row][3]	=	math;		// ����
		arr[row][4]	=	kor+eng+math;	// ����
		arr[row][5]	=	arr[row][4]/3;	// ���
		arr[row][6]	=	1;		// ����
		row++;
		
		
		/*for(int i=0; i<arr.length; i++) {
			for(int j=0; j<7; j++) {
				arr[i][j] = sc.nextInt(); ������� �Է�	
			}
		}*/
		
		
	}	// ����� �޼ҵ带 ����. 
	
	public void viewData() {
		rankMethod();
		System.out.println("�й�\t����\t����\t����\t����\t���\t����\t");
		for(int i=0; i<row; i++) {	// ������ row�� �����ϸ�, �迭�� �Էµ��� ���� ���� �����ȴ�.
			// for(int i=0; i<arr.length; i++){
			//	if(arr[i][0]==0) break;
			//  } �� ���� �ᵵ, �迭�� �Էµ��� ���� ������ ��µ��� �ʴ´�.
			for(int j=0; j<arr[i].length; j++) {	// arr[i].length�� ������ �����ϸ�, i���� ���� ������ �ǹ��ϹǷ�, ���� �� �߰��ɶ� �ڵ����� ����.
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	
	public void rankMethod() {
		for(int i=0; i<row-1; i++) {	// 1�� �� ��. -1�� �����ν� row������ �Ѿ�� ���� ����.
			for(int j=i+1; j<row; j++)	// �ٷ� ���� ���� ���� �񱳸� �ϱ� ������ ��-������ ������ ���� ���� ����.
			if(arr[i][4] > arr[j][4]) {	// ���� ���� ��. ������ ���� 1�� �� ���� �Ͱ� ���� ���ϱ⿡.
				arr[j][6]+=1;			// �� ���� �ʿ� ���� +1 �ο�. 
			}else { 
				arr[i][6]+=1;			// �� ���� �ʿ� ���� +1 �ο�.
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		TwoArrayScore manager	=	new TwoArrayScore();
		
		while(true) {	//while ���ѷ������� ���.
			manager.showMenu();		// �޴� �����ֱ�
			int num = sc.nextInt();	// �޴�����
			switch(num) {
				case 1 :
					manager.inputData();
					break;
				case 2 :
					manager.viewData();
					System.exit(0);
				default : System.out.println("�Է¿���.");
			}
		
		}

	}

}
