package day06;

// �����������̽�
public class PlayerMain {

	public static void showMenu() {
		System.out.println("�޴��� �Է��ϼ���.");
		System.out.println("1.������ �ڷḦ �Է��ϼ���");
		System.out.println("2.������ �ڷḦ ����մϴ�.");
		System.out.println("3.����ã��.");
		System.out.println("4.����.");
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
				System.out.println("���α׷��� ���� �մϴ�.");
				System.exit(0);
			default :
				System.out.println("�Է¿���");
			}
			
		}

	}

}
