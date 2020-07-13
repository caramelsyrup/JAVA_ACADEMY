package day01;

public class Exam03 {

	public static void main(String[] args) {
		// 변수 a 132할당
		// 변수 b 20할당
		// 덧셈, 뺼셈, 곱셈, 나눗셈 결과 값 출력.
		// int = 4바이트 = 32비트
		// long = 8바이트
		// 실수형태 , double = 8바이트 , float = 4바이트
		// 문자형태 , char
		// 
		
		int a; 
		a=132;
		int b; 
		b=20;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("덧셈 : "+(a+b));
		System.out.println("뺄셈 : "+(a-b));
		System.out.println("뺄셈 : "+(b-a));
		System.out.println("곱셈 : "+(a*b));
		System.out.println("나눗셈 : "+(a/b));
		System.out.println("나눗셈 : "+(b/a));	 // 변수가 정수 형태이기에, 소수점은 무시된다.
		System.out.println("나머지 : "+(a%b));
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"%"+b+"="+(a%b));
		
		long c = 100000000000L; // int가 자동으로 설정 되어 있기에, long형을 쓰려면 수치에 L을 붙인다. 강제로 변환.
		
		float d=2.53f;	// f를 붙여서 강제로 변환.
		double e=3.258;	// double이 자동, 기본 설정.
		char ch = 'a';	// 문자형태 저장.
		
		System.out.println(c+d+e+ch);
	}

}
