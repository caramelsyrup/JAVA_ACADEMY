package day07_cooporation;

public class TakeTrans {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿",5000);
		Student s2 = new Student("�̼���",10000);
		Student s3 = new Student("������",100000);
		
		Bus bus = new Bus(100);
		//s1�л��� 100�� ������ ź��.
		s1.takeBus(bus); // 100�� �Ű������� �����ʰ�, bus ��ü�� �Ű�������.
		
		Subway subway = new Subway("2ȣ��");
		// s2�л��� 2ȣ���� ź��.
		s2.takeSubway(subway);
		
		Taxi taxi = new Taxi("����");
		s3.takeTaxi(taxi);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		bus.showInfo();
		subway.showInfo();
		taxi.showInfo();
	}

}
