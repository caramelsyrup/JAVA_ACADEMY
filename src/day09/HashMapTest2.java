package day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map	=	new HashMap<String, String>();
		
		map.put("java", "1111");
		map.put("oracle", "1234");
		map.put("jsp", "abcd");
		// 기존 데이터베이스에 아이디와 비번이 존재.
		System.out.println("아이디를 입력하세요.");
		String userID = sc.nextLine();
		System.out.println("패스워드를 입력하세요.");
		String userPassword = sc.nextLine();
		// id를 입력하는 문장.
/*		if(map.containsKey(userID)) {	// id 물어보기.
			System.out.println("패스워드를 입력하세요.");
			String userPassword = sc.nextLine();	// id가 맞기에, 비번을 물어봄.
			if(map.containsValue(userPassword)) {	// 비번 묻기.
				System.out.println("로그인 성공.");		// 비번 맞으면 로그인 성공.
			}else {							
				System.out.println("패스워드가 잘못되었습니다.");	// 패스워드 잘못.
			}
		}else {
			System.out.println("아이디가 잘못되었습니다.");		// 아이디 잘못.
		}
*/
		if(map.containsKey(userID)==false){
			System.out.println("아이디가 없습니다.");
		}else if(map.get(userID).equals(userPassword)==false) {	// 해당 키로 가서 그것의 벨류값과 입력된 userPassword가 일치하는지 비교.
			System.out.println("비밀번호가 불일치.");
		}else {
			System.out.println("로그인성공");
		}
	
	sc.close();
	}
	
}
