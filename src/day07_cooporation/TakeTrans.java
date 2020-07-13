package day07_cooporation;

public class TakeTrans {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동",5000);
		Student s2 = new Student("이순신",10000);
		Student s3 = new Student("강감찬",100000);
		
		Bus bus = new Bus(100);
		//s1학생이 100번 버스를 탄다.
		s1.takeBus(bus); // 100을 매개변수로 하지않고, bus 객체를 매개변수로.
		
		Subway subway = new Subway("2호선");
		// s2학생이 2호선을 탄다.
		s2.takeSubway(subway);
		
		Taxi taxi = new Taxi("개인");
		s3.takeTaxi(taxi);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		bus.showInfo();
		subway.showInfo();
		taxi.showInfo();
	}

}
