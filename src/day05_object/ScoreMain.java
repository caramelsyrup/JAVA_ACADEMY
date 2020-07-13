package day05_object;

import java.util.Scanner;

public class ScoreMain {	// 유저가 보는 화면.
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();	// Teacher 클래스의 t1객체 생성.
		while(true) {	// 항상 참인 값을 줘서 항상 실행.
			t1.showMenu();	// 초기화면이 뜨도록 설정.
			int num = sc.nextInt(); // 기능 판단을 위해서 변수 설정.
			switch(num) {
			
				case 1: t1.inputData(); break;	// 1이면 입력
				case 2: t1.viewData(); break;	// 2이면 데이터 보기
				case 3: System.out.println("종료");	// 3이면 종료
						System.exit(0);			// 프로그램 종료.
				default : System.out.println("입력오류");	// 나머지는 입력오류, 다시 선택.
			}
			
		}
	}

}
