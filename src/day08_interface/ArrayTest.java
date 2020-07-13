package day08_interface;

import java.util.ArrayList;

public class ArrayTest {
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();	// �ڹ� ���� ArrayList ���. �޼ҵ�� ����.
		arr.add(1);	// Integer��� Ŭ������ ��. int�� ������ ������ Ŭ������ �ƴ�.
		arr.add("�ȳ�");	// String ���¶� Ŭ����.
		arr.add(3.2);	// Double�̶�� Ŭ������ ��.
		
		System.out.println(arr.get(arr.size()-1));	// get�� ����Ͽ�, ��ġ ã�Ƴ�.
		System.out.println(arr.size());	// �޼ҵ�� ������, length��ſ� size�� ���.
	
		arr.add(new Integer(3));	// �迭�� Integer�� �߰�. �迭�� �������κп� �߰��� ��. 1 ,"�ȳ�" , 3.2 , 3 ��.
		System.out.println(arr.size()); // �׷��� 4�� ���.
		
		arr.remove(0);	// arr �迭�� 0��° �� ����.
		arr.remove("�ȳ�");	// arr�迭�� "�ȳ�" ���� �ִ� ���� ����.
		System.out.println("ũ�� : "+arr.size());
		
		arr.add(1, "�����ڹ�");	// arr �迭�� 1������ ���� ����.
		System.out.println("ũ�� : "+arr.size());
		
		ArrayList<Integer>alist = new ArrayList<Integer>();
		alist.add(1);
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("java");
		list.add("jsp");
		
		for(Integer s: alist) {
			System.out.println("�迭 �� : "+s);
		}
		
		ArrayList<Shape>dlist = new ArrayList<Shape>();	// Ŭ�������¸� �����ؼ� �迭�� ������� �ִ�.
			
	}
}
