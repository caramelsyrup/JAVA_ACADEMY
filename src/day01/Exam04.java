package day01;

public class Exam04 {

	public static void main(String[] args) {
		// 반지름  r을 5로 설정.
		// 원의 넓이를 출력하시오.
		// 원주율은 3.14
		
		int r;
		r=5;
		System.out.println(r);
		
		double rr;
		rr=5;
		System.out.println(rr);
		
		double R;
		R=3.14;
		System.out.println(R);
		// final double 로 선언하면, 해당 변수의 값을 수정시킬수 없음. 보통 대문자로 변수 표현. 이후에 해당 변수의 값을 변동시키면 에러가 뜸.
		// final double PI = 3.14; 로 쓴다.	
		
		double A;
		A = r*r*R;
		
				System.out.println(A);	
				System.out.println(rr*rr*R);	// double형끼리 연산
				System.out.println("원의 넓이는 "+(r*r*R));	// int와 double을 섞어서 연산. 결과는 실수형인 double.
				
		float f=5.0f;	// 4바이트
		int num=10;		// 4바이트
		f=num;	// java에서는 실수형 float > 정수형 int. 자동으로 형변환이 이뤄진다.
		System.out.println("f:"+f);
		
		num=(int)f; // float형을 int형으로 형변환. 명시적 형변환. 자동이 아닌 수동적으로 이루어짐.
		
		long num1=100L;
		f=num1;	// float=long . 용량은 long형이 더 크지만, java에서는 실수형이 정수형보다 더 넓은 범위로 인지.
		
		
		
	}

}
