package day04;

public class Student {	// 학생이라는 클래스를 만듦.
	int StudentID;	// 학번
	String name;	// 이름
	int grade;		// 학년
	String address;	// 주소	-------------- 이것들은 속성(멤버변수)
	
	// 공부하다. 기능 설정. = 행위 (메소드)
	public void study() {
		System.out.println(name+" 공부하다");
	}
	public void play() {
		String a = name+address;
		System.out.println(name+" 놀이를 하다");	// play라는 함수(메소드)를 만들고 출력문이 실행.
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();	//s1은 1명의 구체적인 학생이고, s1에 Student클래스를 새로이 넣어 만듦.
		s1.StudentID=100;	//Student클래스이용하여 값을 저장. 이미 Student 클래스에서 변수를 만들어 놓았음. 형태도 지정.
		s1.name="홍길동";		//
		s1.grade=1;			//
		s1.address="부산";	//
		
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.name);
		s1.study();			// s1객체가 메소드를 실행.study로 미리 만들어 놓은 메소드임.
		
		Student s2	=	new Student();	// s2라는 새로운 객체를 생성.
		s2.StudentID=200;	//Student클래스를 이용한 정보 저장. 
		s2.name="이순신";		//
		s2.grade=2;			//
		s2.address="서울";	//
		
		System.out.println(s2.name);
		System.out.println(s2.address);
		
		// 이름 강감찬, 3학년, 인천, s3를 생성. 이름과 주소 출력.
		
		Student s3 = new Student();	// s3라는 새로운 객체 생성.
		s3.StudentID=300;
		s3.name="강감찬";
		s3.grade=3;
		s3.address="인천";
		
		System.out.println(s3.name+" & "+s3.address);
		s3.study();
		
		// 학생은 play()라는 함수(메소드), 이름+운동한다 라는 값을 출력.
		s1.play();
		s2.play();
		s3.play();
		
		
	}
}
