package day07_cooporation;

public class Student {
	
	private String studentName;	// �̸�
	private int studentGrade;	// �г�
	private int studentMoney;	// ��
	
	public Student() {	// ����Ʈ ������
		
	}
	
	public Student(String studentName, int studentMoney) { // ������
		this.studentName = studentName;
		this.studentMoney = studentMoney;
	}
	//����Ÿ��. �Ű������� ��ü�� ����.
	void takeBus(Bus bus) {
		bus.take(1000);
		this.studentMoney-=1000;
	}
	
	//����ö Ÿ��. �Ű������� ��ü�� ����.
	void takeSubway(Subway subway) {
		subway.take(1500);
		this.studentMoney-=1500;
	}
	
	void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.studentMoney-=10000;
	}
	
	void showInfo() {
		System.out.println("�л� �̸� : "+studentName);
		System.out.println("�л� �ܾ� : "+studentMoney);
		System.out.println("�л� �г� : "+studentGrade);
	
	}
}
