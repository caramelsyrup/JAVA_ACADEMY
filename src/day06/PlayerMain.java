package day06;

// 유저인터페이스
public class PlayerMain {

	public static void showMenu() {
		System.out.println("메뉴를 입력하세요.");
		System.out.println("1.선수의 자료를 입력하세요");
		System.out.println("2.선수의 자료를 출력합니다.");
		System.out.println("3.선수찾기.");
		System.out.println("4.종료.");
	}
	
	public static void main(String[] args) {
		PlayerManager pm = new PlayerManager();
		while(true) {
			PlayerMain.showMenu();
			int choice = BookMain.sc.nextInt();
			BookMain.sc.nextLine();
			switch(choice) {
			case 1 :
				pm.insertPlayer(); break;
			case 2 :
				pm.viewPlayer(); break;
			case 3 :
				pm.searchPlayer(); break;	
			case 4 :
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
			default :
				System.out.println("입력오류");
			}
			
		}

	}

}
