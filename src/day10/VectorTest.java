package day10;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);				// 0��°
		v.add(new Integer(5));	// 1
		v.add(-1);				// 2
		v.add(2,100);	// 2�� ��ġ�� �߰��϶�.
		for(Integer i:v) {
			System.out.println(i+"\t");
		}
		System.out.println();
		Iterator<Integer> it = v.iterator();	// iterator �޼ҵ带 �̿��ϸ�, next�� �̿��ؼ� ���� �̵�.
		while(it.hasNext()) {
			System.out.println(it.next()+"\t");
		}
		System.out.println();
	}

}
