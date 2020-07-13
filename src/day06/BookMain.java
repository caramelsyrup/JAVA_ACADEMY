package day06;

import java.util.Scanner;

public class BookMain {
	static Scanner sc = new Scanner(System.in);
		
		int cnt;
	
		BookBean[] arr = new BookBean[50];
		
		public void showMenu() {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1.데이터 입력");
			System.out.println("2.목록보기");
			System.out.println("3.종료");
		}
		
		public void bookInsert() {
			System.out.println("데이터 입력하세요.");
			System.out.println("책 제목");
			String title = sc.nextLine();
			System.out.println("책 저자");
			String writer = sc.nextLine();
			
		//	arr[0]	=	new BookBean(title,writer); 이 개념이 배열에 BookBean 생성자를 이용한 입력방법.
			arr[cnt] = new BookBean(title, writer);
			cnt++;
		//	arr[cnt++] = new BookBean(title, writer); // 한문장으로.
		}
		
		public void bookList() {
			System.out.println("책 리스트");
		//	System.out.println("책 제목"+"\t"+"책 저자");
		/*	for(int i=0; i<arr.length; i++) {
				if(arr[i]!=null) {
					System.out.print(arr[i].title);
					System.out.println(arr[i].writer);
				}
			}
		*/	
			for(BookBean a : arr ) {
				if(a!=null) {
					System.out.println("책 제목 : "+a.getTitle()+" 책 저자 : "+a.getWriter());
				}else
					break;
			}	
		}
		
	public static void main(String[] args) {
		
		BookMain bm = new BookMain();
		
		while(true) {
			bm.showMenu();
			int choice = sc.nextInt();
			BookMain.sc.nextLine();	// 1,2,3을 선택후 엔터를 감지하기에, 엔터를 버리려는 의미에서
			switch(choice) {
			case	1:
				bm.bookInsert(); break;
			case	2:	
				bm.bookList(); break;
			case	3:
				System.out.println("종료");
				System.exit(0);
			default	:
				System.out.println("입력오류");
			}
		}
		
		
		
	}

}
