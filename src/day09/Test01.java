package day09;

	import java.util.ArrayList;
import java.util.Collections;
// Map이 HashMap보다 상위 클래스
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Test01 {

	public static void main(String[] args) {
		// 1부터 20사이의 난수 10개를 map에 넣으시오.
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();	// HashMap은 클래스명이 들어가야함.
		// arr 배열을 만드는데, 정수형,실수형 가능.
		// 중복 난수 허용 안함. 난수가 이미 배열에 들어가면 안된다는것.
		for(int i=1; i<11; i++) {
			int value = (int)(Math.random()*20)+1;
			while(true) {
				if(map.containsValue(value)==false) { // map.containsValue(value) == false
					map.put(i, value);
					break;
				} //if
			}//while
		}//for
		System.out.println(map);
		
		for(Integer i : map.values()) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list);
		for(int i : list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		Collections.reverse(list);
		for(int i : list) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}
