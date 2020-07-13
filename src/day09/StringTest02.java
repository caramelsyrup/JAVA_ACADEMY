package day09;

public class StringTest02 {
	public static void main(String[] args) {
		
		String str = "안녕하세요. Hello. 자바 공부중!";
		System.out.println("str 길이 : "+str.length());
		System.out.println("H위치 : "+str.indexOf('H'));
		System.out.println("Hello 위치 시작점 : "+str.indexOf("Hello"));
		System.out.println("4번째 문자 : "+str.charAt(4));	// 순서는 0부터 시작.
		
		String tmp = "열심히 합시다.";
		System.out.println("str과 tmp 연결 : "+str.concat(tmp));	// 결합 메서드 concat
		System.out.println("str과 tmp 연결 : "+tmp.concat(str));
		
		int value =7;
		System.out.println("str과 value 연결 : "+str.concat(String.valueOf(value)));	
		// contcat의 기본은 String끼리만. 그래서 String의 메서드 valueOf를 이용해서 int형의 변수를 String형으로 바꿈.
		// String s = String.valueOf(value); 한뒤 s를 넣어도 된다. str.concat(s)로 써도 된다.
		
		String msg = "abcdefg";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		
		String[] arr = str.split(" ");
		// String arr[] 도 맞는 표현.
		for( String ar:arr) {
			System.out.println(ar);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.length);
	}
}
