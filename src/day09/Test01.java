package day09;

	import java.util.ArrayList;
import java.util.Collections;
// Map�� HashMap���� ���� Ŭ����
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Test01 {

	public static void main(String[] args) {
		// 1���� 20������ ���� 10���� map�� �����ÿ�.
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();	// HashMap�� Ŭ�������� ������.
		// arr �迭�� ����µ�, ������,�Ǽ��� ����.
		// �ߺ� ���� ��� ����. ������ �̹� �迭�� ���� �ȵȴٴ°�.
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
