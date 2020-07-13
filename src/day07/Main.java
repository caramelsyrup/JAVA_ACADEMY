package day07;

public class Main {

	public static void main(String[] args) {
		
		
		Father f1 = new Father(); // 아버지 생성자 출력.
		// f1.fatherPrint();	
		
		System.out.println();
		
		Child c1 = new Child();	 // 아버지 생성자가 뜨고나서 자식생성자 출력. 아버지 클래스를 상속받기에.
		// c1.childPrint();	
		System.out.println();
		
		GrandFather g1 = new GrandFather(); // 선언과 생성이 된 형태.
		
		System.out.println();
		
		f1.methodTest();
		f1.grandPrint();
		c1.methodTest();
		c1.grandPrint();// Child 클래스는 GrandFather클래스의 상속을 받았기에, GrandFather클래스의 메소드 사용 가능.
		
		GrandFather g2; // 선언만 한 것. 생성이 되지 않음.
		Father f2 = new Father();
		g2 = f2; // GrandFather = Father, 상속관계이기에 상위층이, 강제 형변환은 가능하다. f2=(Father)g2 가능.
		
		g2.grandPrint();// GrandFather 클래스의 메소드만 이용가능. 하지만 해당 메소드가 오버라이드 되었다면, 오버라이드 된 메소드가 실행.
						// Father 클래스에서 해당 메소드를 오버라이드 했으면, 지금 실행은 Father의 것으로 됨.
	
		GrandFather g3 = new Father(); // 하지만 Father클래스에서 처음 만들어진 메소드들은 사용할수 없다.
	}

}
