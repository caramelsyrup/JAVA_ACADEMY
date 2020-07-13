package day10;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	public static Scanner sc = new Scanner(System.in);
	private HashMap<String, String> map = new HashMap<String, String>();	// 순서가 없다. 배열로 담아줘야한다.
	public CapitalApp() {	// 생성자 
		map.put("한국", "서울");
		map.put("일본", "동경");
		map.put("중국", "베이징");
		map.put("미국", "워싱턴");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("독일", "베를린");
	}	// 해쉬 맵은 순서가 없다. 배열에 담아 줘야 한다.

	public static void showMenu() {
		System.out.println("===나라의 수도 맞추기 게임을 시작합니다.===");
		System.out.println("입력 : 1 , 퀴즈 : 2, 종료 : 3 >>>");
	}
	public void input() {
		System.out.println("현재 "+map.size()+" 개 나라와 수도 입력");
		while(true) {
			System.out.println("나라와 수도 입력(종료는 x)>>");
			String cont = sc.next();
			if(cont.toUpperCase().equals("X")) break;	// 입력받는 값은 항상 대문자.반복문 종료.
			if(map.containsKey(cont)) {
				System.out.println("이미 입력한 나라입니다.");
				continue;	// 반복문을 다시 수행해라.
			}
			String sudo = sc.next(); // 수도 추가.
			map.put(cont, sudo);
			
		}
	}
	private void test() {
		Set<String> set = map.keySet(); // Set은 중복을 허용않는 배열로 변환.
		System.out.println();
		Object[] arr = set.toArray();	// set을 배열 형태로 변환(순서를 알기 위해서)
		while(true) {
			int n =(int) (Math.random()*map.size());	// 0<n<1 = 0<n<7
			//나라 이름, 도시이름 저장.
			String country = (String) arr[n];
			String city	   = map.get(country);
		
			// 문제출제.
			System.out.println(country+"의 수도는? 종료는 x>>");
			String en = sc.next();
				if(en.toLowerCase().equals("x")) break;
				if(en.equals(city)) {
					System.out.println("정답");
				}else {
					System.out.println("오답");
			}
		}
	}

	public static void main(String[] args) {
		CapitalApp ca = new CapitalApp();
		while(true) {
			CapitalApp.showMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ca.input(); break;
			case 2:
				ca.test(); break;
			case 3:
				System.out.println("종료");
				System.exit(0);
			default :
				System.out.println("입력오류");
			}
		}

	}

}
