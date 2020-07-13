package day09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.해쉬맵 map을 생성.
		Map<String, Integer> map = new HashMap<String, Integer>();
		//2.단어를 입력받아 단어와 입력 횟수 저장.
		while(true) {
			System.out.println("단어를 입력하세요.");
			String word = sc.nextLine();	// 단어입력.
			if(word.toLowerCase().equals("x")) break;	// x입력될시 종료.		
/*			if(map.containsKey(word)) {	// word가 기존 hashmap에 존재 하는지 비교. key값에 존재하는지.
				map.put(word, map.get(word)+1);	// key값이 존재하던 것이라면, 1을 추가로 더하라. 입력 순서에 상관없어야 하기에 n++는 사용 하지 못함.
			}else {
				map.put(word,1);	// key값이 새로운 값이면, 1이 등록.
			}
*/			
			map.put(word, map.get(word)==null? 1 : map.get(word)+1 );
		}
		System.out.println(map);
	sc.close();
	}
}
