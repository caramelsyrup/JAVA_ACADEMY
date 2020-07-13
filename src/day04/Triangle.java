package day04;

public class Triangle {

	double bottom,height;
	
	//double area;
	
	// Triangle 클래스 내의 전역 변수 설정.
	
	public  Triangle(double bottom, double height ){
		this.bottom = bottom;
		this.height = height;
	}
	public Triangle() {
		
	}
	// 생성자 코드작성.
	
	public double setBottom(double bottom) {
		this.bottom = bottom;
		return bottom;
	}
	// double형 기입을 할수 있도록 함수(메소드) 설정.
	
	public void setHeight(double height) {
		this.height = height;
		
	}
	// return값이 중요한 상황이 아니라서 void를 사용.
	
	public double getArea() {
		//area = (bottom*height)/2;
		//return area;
		return (bottom*height)/2;
	}	// area라는 변수를 굳이 만들지 않고도, 리턴값을 생성하도록 유도.
	public double getArea1() {
		//area = (bottom*height)/2;
		//return area;
		return (bottom*height);
	}	// area라는 변수를 굳이 만들지 않고도, 리턴값을 생성하도록 유도.
	
	
	
	// bottom과 height를 이용하여, 넓이를 구할수 있도록 함수(메소드) 설정.
	
	
}
