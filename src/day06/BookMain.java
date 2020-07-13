package day06;

import java.util.Scanner;

public class BookMain {
	static Scanner sc = new Scanner(System.in);
		
		int cnt;
	
		BookBean[] arr = new BookBean[50];
		
		public void showMenu() {
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println("1.������ �Է�");
			System.out.println("2.��Ϻ���");
			System.out.println("3.����");
		}
		
		public void bookInsert() {
			System.out.println("������ �Է��ϼ���.");
			System.out.println("å ����");
			String title = sc.nextLine();
			System.out.println("å ����");
			String writer = sc.nextLine();
			
		//	arr[0]	=	new BookBean(title,writer); �� ������ �迭�� BookBean �����ڸ� �̿��� �Է¹��.
			arr[cnt] = new BookBean(title, writer);
			cnt++;
		//	arr[cnt++] = new BookBean(title, writer); // �ѹ�������.
		}
		
		public void bookList() {
			System.out.println("å ����Ʈ");
		//	System.out.println("å ����"+"\t"+"å ����");
		/*	for(int i=0; i<arr.length; i++) {
				if(arr[i]!=null) {
					System.out.print(arr[i].title);
					System.out.println(arr[i].writer);
				}
			}
		*/	
			for(BookBean a : arr ) {
				if(a!=null) {
					System.out.println("å ���� : "+a.getTitle()+" å ���� : "+a.getWriter());
				}else
					break;
			}	
		}
		
	public static void main(String[] args) {
		
		BookMain bm = new BookMain();
		
		while(true) {
			bm.showMenu();
			int choice = sc.nextInt();
			BookMain.sc.nextLine();	// 1,2,3�� ������ ���͸� �����ϱ⿡, ���͸� �������� �ǹ̿���
			switch(choice) {
			case	1:
				bm.bookInsert(); break;
			case	2:	
				bm.bookList(); break;
			case	3:
				System.out.println("����");
				System.exit(0);
			default	:
				System.out.println("�Է¿���");
			}
		}
		
		
		
	}

}
