package day07_cooporation;

public class Student {
	
	private String studentName;	// 이름
	private int studentGrade;	// 학년
	private int studentMoney;	// 돈
	
	public Student() {	// 디폴트 생성자
		
	}
	
	public Student(String studentName, int studentMoney) { // 생성자
		this.studentName = studentName;
		this.studentMoney = studentMoney;
	}
	//버스타다. 매개변수로 객체를 지정.
	void takeBus(Bus bus) {
		bus.take(1000);
		this.studentMoney-=1000;
	}
	
	//지하철 타다. 매개변수로 객체를 지정.
	void takeSubway(Subway subway) {
		subway.take(1500);
		this.studentMoney-=1500;
	}
	
	void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.studentMoney-=10000;
	}
	
	void showInfo() {
		System.out.println("학생 이름 : "+studentName);
		System.out.println("학생 잔액 : "+studentMoney);
		System.out.println("학생 학년 : "+studentGrade);
	
	}
}
