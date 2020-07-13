package day09;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("one", "first");	
		hm.put("two", "second");
		hm.put("three", "third");
		
		System.out.println(hm); // 순서는 상관없다. Key = Value로 저장.
		System.out.println(hm.size()); // 크기는 3이다.
		hm.put("one", "첫번쨰");
		System.out.println(hm);	// 덮어 써버린다.중복이 불허.
		System.out.println(hm.size());
		System.out.println(hm.get("two"));	// Key를 물으면, Value 값을 리턴해줌.
		hm.put("1", "새로넣음");	// String으로 만들었기에, int는 불가능.
		System.out.println(hm);	// 새로 추가된 사항이 출력.
		
		// key 값을 출력.
		for(String s:hm.keySet()) {
			System.out.println(s);	// keySet을 쓰면 key값 리턴.
		}
		System.out.println("------------------------");
		//value 값을 출력.
		for(String s:hm.keySet()) {
			System.out.println(hm.get(s));	//get을 써서 value값 리턴.
		}
		System.out.println("------------------------");
		System.out.println(hm.containsKey("1")); // key에 "1"이 있는지를 검색.
		System.out.println(hm.containsValue("first"));
		System.out.println("------------------------");
		for(String s:hm.values()) {
			System.out.println(s);		// values를 써서 value값 리턴.
		}
		
		
		
	}
	
}
