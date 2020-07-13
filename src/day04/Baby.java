package day04;

import java.util.Scanner;

public class Baby {
	
	String name;
	int age;
	
	public Baby(String name) {	// PersonMain에서 생성자를 이용하기에, Baby클래스에서 만들어준다.
		this.name = name;		// 입력되는 값을 변수에 넣는데, name으로 동일하기에, this.으로 변수를 지정해 준다.
	}
	
	public Baby() {	// 생성자를 이용하지 않을 수도 있기에, 디폴트 생성자를 만들어준다.
	}
	
	// 웃는다
	public void smile() {
		System.out.println(name+"은(는) 웃는다.");
	}
	//운다
	public void cry() {
		System.out.println(name+"은(는) 운다.");
	}
//------------------------------------------------------------------------------------------------	
	public static void main(String[]args) {
		// Baby 객체 b1을 만들고
		// 이름, 나이, 웃는다. 등
		Scanner sc = new Scanner(System.in);
		
		
		Baby b1 = new Baby();	// b1 Baby클래스의 객체를 생성. Baby클래스가 상위 개념.
		b1.age=2;
		b1.name="아가";
		
		System.out.print(b1.age+"세 ");
		b1.smile();
		
		Baby b2	= new Baby();
		b2.age=1;
		b2.name="애기";
		
		System.out.print(b2.age+"세"+" ");
		b2.cry();
		System.out.println();
		System.out.println("아이의 이름을 입력하세요.");
		
		String Name = sc.next();
		Baby b3 = new Baby(Name);
		b3.cry();
		
	}

}
