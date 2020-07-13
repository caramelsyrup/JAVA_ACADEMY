package day07;

public class PointMain extends Point{
	
	private String color;
	
	public PointMain(int x, int y, String color) {
		 super(x, y);
		// super(); 를 굳이 사용하고 싶다면, 부모클래스의 생성자를 디폴트 생성자도 추가하라.
		// System.out.println(color); 바로써도 되지만, 오버라이딩을 이용하자.
		 this.color = color;
	}
	
/*	public void disp() {	//오버라이딩. 이미 부모클래스에 있는 메소드를 자식클래스에서 변경. 여기에서 메소드명이 달라지면, 새로운 메소드를 만드는것.
		super.disp();		//부모클래스에 존재하는 메소드를 불러옴.
		System.out.println("Color : "+this.color);
	}
*/
	@Override		// 컴파일 할때 알려주는 것, 만약 아래의 메소드명이 달라지게 되면 오류가 난다.
	public void disp() {
		super.disp();
		System.out.println("Color : "+this.color); 
	}
	public static void main(String[] args) {
	
		PointMain pm = new PointMain(4,5,"Yellow");
		pm.disp();	// 부모 클래스인 Point에서 정의된 메소드를 사용.
		pm.move(10,20);
		pm.disp();
		System.out.println(pm.str);
	}

}
