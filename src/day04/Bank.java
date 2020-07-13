package day04;

import java.util.Scanner;

public class Bank {
	
	String name;	// 멤버 변수. 해당 변수는 Bank 클래스를 참조하면, 다른곳에서도 사용가능.
	int money;
	
	public Bank(String name, int money) {	// 값이 들어갈수 있는 생성자.
		this.name=name;
		this.money=money;
		System.out.println(name+" : "+money);
	}
	
	public Bank() {	// 디폴트 생성자.
		
	}
	
	
	// 입금
	public int inMoney(int a) {	// a는 해당 메소드내에서만 지정해놓았음. 다른 곳에서 사용 불가능.
		System.out.println(name+"고객님의 "+a+"원 입금되었습니다.");
		return money+=a;
		
	}
	
	// 출금
	public int outMoney(int a) {
												// if else를 많이 적는 것보다 void와 return을 사용하여, 함수를 종료.
		if(a>=0) {
			if(money>=a) {
				System.out.println(name+"고객님의 "+a+"원 출금되었습니다.");
				return money-=a;
			}else if(money<a) {
				System.out.println(name+"고객님의 잔액이 부족합니다.");
				System.out.println(name+"고객님의 현재 잔액은 "+money+"입니다.");
				return money;
			}else {
				return money;
			}
		 }else{
			 System.out.println(name+"고객님 올바른 기입 부탁드립니다.");
			 return money;
		}
	}
	
	//public void outmoney(int a) {
		
	//}
	
	// 잔액확인
	public void stmoney() {
		if(money>=0) {
			System.out.println(name+"고객님의 잔액은 "+money+"원 입니다.");
		}else {
			System.out.println(name+"고객님의 잔액이 부족합니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Bank b1 = new Bank();	// b1 고객의 객체 생성.
		b1.name="홍길동";			// b1 객체의 속성값. Bank클래스에서 설정해놓은 속성.
		
		System.out.println("고객님의 잔액을 입력하세요.");
		b1.money=sc.nextInt();
		System.out.println();
		
		System.out.println("고객님의 입금액을 입력하세요.");
		b1.inMoney(sc.nextInt());
		System.out.println();
		
		System.out.println("고객님의 출금액을 입력하세요.");
		b1.outMoney(sc.nextInt());
		System.out.println();
		
		b1.stmoney();
		// System.out.println(b1.name); // class Bank에서 설정된 변수이기에 해당 클래스를 참조하면, 어디든 사용가능.
		System.out.println();
		*/
		
		//b1.money=5000;
		//b1.outMoney(3000);
		//b1.stmoney();
		
		/*Bank b2	= new Bank();	// b2  객체를 만듦. Bank클래스의.
		b2.name	= "이순신";
		b2.inMoney(10000);
		b2.stmoney();
		b2.outMoney(20000);
		b2.stmoney();				-가 뜨면 잔액부족.
		*/
		Bank b3 = new Bank("강감찬",20000);
		b3.stmoney();
		
	}
	
}
