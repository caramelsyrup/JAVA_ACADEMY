package day04;

public class StudentMain {
	
	public static void main(String[] args) {
		// 이름 홍길동, 점수 총점, 평균 출력. 100,80,70
		StudentScore s1 = new StudentScore("홍길동",100,80,70);	// 생성자를 이용하는 것을 알 수 있음.
		
		System.out.println(s1.getTotal());	// 해당 메소드가 return값을 가지기에 출력이 된다.
		s1.getAvg();	// return값없이 메소드에서 출력까지 모두 실행.
		
		
	}
}
