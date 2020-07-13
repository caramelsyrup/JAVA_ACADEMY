package day04;

public class Car {
	String carKind;
	String carColor;
	int speed;
	
	public Car(String carColor,String carKind) {	// 생성자는 반드시 클래스명과 동일. void 등을 붙이면, 메소드가 되버리기에, 넣지 않는다.
		this.carColor=carColor;
		this.carKind=carKind;
	}
	//디폴트 생성자 => 생략도 가능하다. 하지만 이미 다른 생성자가 존재할때는 생략 불가능.
	//오버로딩
	public Car() {
		
	}	// 아무것도  입력하지 않는 상태.
	
	  public int speedUp (int a) {	// 해당 값으로 다른 연산을 하지 않는다면.
		// System.out.println("속도 : "+ a );
		speed=a;
		return a;					// 해당 메소드에 값이 들어갔을 때, 그값을 리턴 결과값.
	}
	
	
	//public void speedUp (int speed) {	// 해당 값으로 다른 연산을 하지 않는다면. void
	//		this.speed	=	speed;	
	//	}
		
	
	public void stop () {
		speed=0;
	}
	
	public void speedDown (int speed) {	// 해당 값으로 다른 연산을 하지 않는다면. void
		this.speed	=	speed;	// 입력되는 값과 저장되는 변수는 이름을 동일하게 사용. 대신 저장되는 변수를 정확히 지정하기 위해 this.을 사용.
	}
	
	public static void main(String[] args) {
		Car mycar = new Car();	// mycar라는 객체 생성. Car 클래스의 하위로
		mycar.carKind="소나타";
		mycar.carColor="흰색";
		mycar.speedUp(100);
		System.out.println("속도 : "+mycar.speed);
		mycar.stop();
		System.out.println("속도 : "+mycar.speed);
		
		Car c1 = new Car();
		c1.carColor="검은색";
		c1.carKind="뉴카";
		c1.speedUp(80);
		System.out.println("속도 : "+c1.speed);
		c1.speedDown(50);
		System.out.println("속도 : "+c1.speed);
		
		System.out.println(c1);		// day04.Car@15db9742 해당 주소에서 
		System.out.println(mycar);	// day04.Car@6d06d69c 해당 주소에서
		// 그래서 이것을 주소값이라고 하고, 레퍼런스 변수라고 한다.
		// 객체들은 해당 속성,함수 값들을 각각 들고 있음. 객체들이 속성,함수를 공유하는 것이 아님. 각기 메모리에 값이 저장됨.
		
		Car c2 = new Car("은색","벤츠");	// c2객체를 만들면서 Car클래스의 초기값을 설정.
		System.out.println(c2.carColor);
		
	}
	
}
