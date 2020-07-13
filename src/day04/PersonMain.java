package day04;

public class PersonMain {

	public static void main(String[] args) {
		/*
		 * p1 만들기
		 * 이름 주소 입력
		 * 홍길동 공부한다. 출력.
		 */
		
		// 다른 클래스에서 만든 것을 객체로 넣어서 활용 가능.
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.addr = "부산";
		p1.study();
		
		Person p2 = new Person("강감찬","서울");
		p2.study();
		System.out.println("--------------------------------------");
		
		Bank b = new Bank("김자바",5000);
		b.stmoney();
		
		System.out.println("--------------------------------------");
		
		Baby baby = new Baby();
		baby.name = "김애기";
		baby.age = 5;
		baby.smile();
		
		System.out.println("--------------------------------------");
		
		Baby baby1 = new Baby("김아가");	// 생성자를 이용한 코드
		baby1.cry();
		
		System.out.println("--------------------------------------");
		
		Gugudan ten = new Gugudan(10);	// Gugudan 클래스에서 이미 만들었음.
		ten.viewData();
		
		System.out.println("--------------------------------------");
		
		
	}

}
