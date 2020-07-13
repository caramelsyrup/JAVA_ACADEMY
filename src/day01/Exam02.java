package day01;

public class Exam02 {

	public static void main(String[] args) {
		// 한줄 주석.
		/* 여러줄 주석입니다.
		 * 정수 age를 선언하고 자신의 나이를 할당 
		 * 문자열 name 을 선언하고 자신의 이름을 할당
		 * 홍길동의 나이는 20세입니다. 로 출력
		 */
		
		int age = 20;	// 정수는 int
		System.out.println(age);
		
		char A = 'a';	// 문자는 char
		System.out.println(A);
		
		String name = "홍길동"; // 문자열은 String
		System.out.println(name);
		
		System.out.println(name+"의 나이는 "+age+"세 입니다." );
		
		age = 40;
		name = "홍아버지";
		
		System.out.print(name+"의 나이는 "+age+"세 입니다." );	// 변수를 설정하면, 변화하는 값에 대응.
		
	}

}
