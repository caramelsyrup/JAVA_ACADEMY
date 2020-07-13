package day09;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("one", "first");	
		hm.put("two", "second");
		hm.put("three", "third");
		
		System.out.println(hm); // ������ �������. Key = Value�� ����.
		System.out.println(hm.size()); // ũ��� 3�̴�.
		hm.put("one", "ù����");
		System.out.println(hm);	// ���� �������.�ߺ��� ����.
		System.out.println(hm.size());
		System.out.println(hm.get("two"));	// Key�� ������, Value ���� ��������.
		hm.put("1", "���γ���");	// String���� ������⿡, int�� �Ұ���.
		System.out.println(hm);	// ���� �߰��� ������ ���.
		
		// key ���� ���.
		for(String s:hm.keySet()) {
			System.out.println(s);	// keySet�� ���� key�� ����.
		}
		System.out.println("------------------------");
		//value ���� ���.
		for(String s:hm.keySet()) {
			System.out.println(hm.get(s));	//get�� �Ἥ value�� ����.
		}
		System.out.println("------------------------");
		System.out.println(hm.containsKey("1")); // key�� "1"�� �ִ����� �˻�.
		System.out.println(hm.containsValue("first"));
		System.out.println("------------------------");
		for(String s:hm.values()) {
			System.out.println(s);		// values�� �Ἥ value�� ����.
		}
		
		
		
	}
	
}
