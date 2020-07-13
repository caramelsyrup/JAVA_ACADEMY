package day01;

public class Exam05 {

	public static void main(String[] args) {
		int a=49;
		// a는 50보다 크다
		
		if(a>50) {	//true
			System.out.println("50보다 크다.");
		}else {	//false
			System.out.println("50보다 작다.");
		}
		
		int b;
		b=a%2;
		// b 변수 설정. 나머지 값이 들어가도록 유도.
		if(b==0) {
			System.out.println("a는 짝수");
		}else {
			System.out.println("a는 홀수");
		}
		
		a=72;
		if(a%2==0) {
			System.out.println("a는 짝수");
		}else {
			System.out.println("a는 홀수");
		}
		
		//다중if 사용
		a=177;
		
		if(a<0) {
			System.out.println("a는 0미만");
		}else if(a<100) {
			System.out.println("a는 100미만");
		}else if(a<200) {
			System.out.println("a는 200미만");
		}else if(a<300) {
			System.out.println("a는 300미만");
		}else {
			System.out.println("a는 300이상");
		}	// 낮은 수부터 논리 연산.
			// else를 사용함으로써 처음if의 구문에서만 논리가 계속 이어나갈수 있도록 범위 설정.
		
		if(a>300) {
			System.out.println("a는 300이상");
		}else if(a>200) {
			System.out.println("a는 200에서 299사이");
		}else if(a>100) {
			System.out.println("a는 100에서 199사이");
		}else if(a>0) {
			System.out.println("a는 0에서 99사이");
		}else {
			System.out.println("a는 0미만");
		}	// 역순으로 표현. 코드를 읽는 자가 어렵지 않도록, 논리를 꼬면 안된다.
		
		int c=100;
		if(c>=0 && c<100) {	//&&는 and의 의미. 두 조건이 모두 참이어야 참이 된다.
			System.out.println("a는 0에서 100미만");
		}if(c>=100 && c<200) {
			System.out.println("a는 100에서 200미만");
		}if(c>=200 && c<300) {
			System.out.println("a는 200에서 300미만");
		}if(c>=300) {
			System.out.println("a는 300이상");
		}
		
		/*
		 * su가  0보다 크고 짝수
		 * su가 0이다.
		 * su가 0보다 크고 홀수
		 */
		int su=45;
		if(su>0) {
			if(su%2==0) {
				System.out.println("su는 0보다 크고 짝수");
			}else {
				System.out.println("su는 0보다 크고 홀수");
			}
		}else if(su==0) {
			System.out.println("su는 0이다");
		}else {
			System.out.println("su는 0보다 작다");
		} // && 연산을 쓰지 않고, else와 if로 작성.
		
		su=0;
		if(su>0 && su%2==0) {
			System.out.println("su는 0보다 크고 짝수");
		}if(su>0 && su%2==1) {	// su % 2 !==0 으로 표현가능
			System.out.println("su는 0보다 크고 홀수");
		}if(su==0) {
			System.out.println("su는 0이다.");
		}	// &&를 써서 if만으로 작성.
		

	}

}
