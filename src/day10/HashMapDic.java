package day10;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HashMap<String,String> dic = new HashMap<String,String>();
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			try {		
					System.out.println("영어 단어를 입력하세요.");
					String en = sc.next();
					
					if(en.toLowerCase().equals("exit")) {
						break;
					}
					
					String kor = dic.get(en);
					if(kor == null) {
						System.out.println("없는 단어");
					}else {
						System.out.println(dic.get(en));
						break;
					}
			}
			catch(NullPointerException e){
				System.out.println("잘못 입력하셨습니다.");
			}
			finally {
				sc.nextLine();
			}
		}
		
	}
}
