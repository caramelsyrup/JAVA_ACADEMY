package day08_interface;

import java.util.ArrayList;

public class ArrayTest {
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();	// 자바 내장 ArrayList 사용. 메소드로 접근.
		arr.add(1);	// Integer라는 클래스에 들어감. int는 데이터 형이지 클래스가 아님.
		arr.add("안녕");	// String 형태라 클래스.
		arr.add(3.2);	// Double이라는 클래스에 들어감.
		
		System.out.println(arr.get(arr.size()-1));	// get을 사용하여, 위치 찾아냄.
		System.out.println(arr.size());	// 메소드로 생성시, length대신에 size를 사용.
	
		arr.add(new Integer(3));	// 배열에 Integer를 추가. 배열의 마지막부분에 추가가 됨. 1 ,"안녕" , 3.2 , 3 순.
		System.out.println(arr.size()); // 그래서 4가 출력.
		
		arr.remove(0);	// arr 배열의 0번째 를 지움.
		arr.remove("안녕");	// arr배열의 "안녕" 값이 있는 것을 지움.
		System.out.println("크기 : "+arr.size());
		
		arr.add(1, "지금자바");	// arr 배열의 1번쨰에 값을 넣음.
		System.out.println("크기 : "+arr.size());
		
		ArrayList<Integer>alist = new ArrayList<Integer>();
		alist.add(1);
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("java");
		list.add("jsp");
		
		for(Integer s: alist) {
			System.out.println("배열 값 : "+s);
		}
		
		ArrayList<Shape>dlist = new ArrayList<Shape>();	// 클래스형태를 지정해서 배열을 만들수도 있다.
			
	}
}
