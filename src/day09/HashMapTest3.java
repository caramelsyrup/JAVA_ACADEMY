package day09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.�ؽ��� map�� ����.
		Map<String, Integer> map = new HashMap<String, Integer>();
		//2.�ܾ �Է¹޾� �ܾ�� �Է� Ƚ�� ����.
		while(true) {
			System.out.println("�ܾ �Է��ϼ���.");
			String word = sc.nextLine();	// �ܾ��Է�.
			if(word.toLowerCase().equals("x")) break;	// x�Էµɽ� ����.		
/*			if(map.containsKey(word)) {	// word�� ���� hashmap�� ���� �ϴ��� ��. key���� �����ϴ���.
				map.put(word, map.get(word)+1);	// key���� �����ϴ� ���̶��, 1�� �߰��� ���϶�. �Է� ������ �������� �ϱ⿡ n++�� ��� ���� ����.
			}else {
				map.put(word,1);	// key���� ���ο� ���̸�, 1�� ���.
			}
*/			
			map.put(word, map.get(word)==null? 1 : map.get(word)+1 );
		}
		System.out.println(map);
	sc.close();
	}
}
