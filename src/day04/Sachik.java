package day04;

public class Sachik {
	
	//덧셈
	public void sum(int a,int b,int c) {	// 함수라서 변수들을 ()에 넣어서 지정 가능.
		System.out.println("덧셈 "+(a+b+c));
	}
	//뺄셈
	public void sub(int a,int b) {
		System.out.println("뺄셈 "+(a-b));
	}
	//곱셈
	public void mul(int a,int b,String c) {	// 데이터 타입은 상관없이, ()에 넣을 수 있도록 지정 가능.
		System.out.println("곱셈 "+(a*b));
		System.out.println(c);
	}
	//나눗셈
	public int div(int a,int b) {	// void는 리턴이 0이라는 의미. 그래서 삭제하고, 리턴되는 데이터의 형에 맞게 지정.
		//System.out.println("나눗셈 몫: "+(a/b));
		//System.out.println("나눗셈 나머지: "+(a%b));
		return a/b; // ()의 값을 나눗셈 연산. 결과값을 다시 돌려준다라는 의미. 
	}
	
	public static void main(String[] args) {
		
		Sachik s1 = new Sachik();
		
		s1.sum(1,5,8);	// 해당 메서드가 ()이 지정되어 있다면, ()에 데이터를 입력하면, 그 데이터로 기능.  
		s1.sub(2,10);
		s1.mul(3,4,"A");
	//	s1.div(4,10);
		
		System.out.println(s1.div(20, 4));	// 함수만으로 바로 도출.
	}

}
