package day10;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);				// 0번째
		v.add(new Integer(5));	// 1
		v.add(-1);				// 2
		v.add(2,100);	// 2의 위치에 추가하라.
		for(Integer i:v) {
			System.out.println(i+"\t");
		}
		System.out.println();
		Iterator<Integer> it = v.iterator();	// iterator 메소드를 이용하면, next를 이용해서 값을 이동.
		while(it.hasNext()) {
			System.out.println(it.next()+"\t");
		}
		System.out.println();
	}

}
