package day04;

public class StudentScore {
	String name;
	int kor;
	int math;
	int eng;
	
	int total;
	double avg;
	
	public StudentScore(String name, int kor, int math, int eng ) {	// �����ڸ� ���.
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	
	}	// StudentMain���� �ٸ� Ȱ���� ���⿡, ����Ʈ �Ǵ� �����ڴ� �ۼ� ����.
	
	public String getTotal () {
		total = kor+math+eng;
	//	System.out.println(name+"���� ������ "+total);
		return name+"���� ������ "+total;	// return ���� �����Ѵ�. �ش� �Լ��� �����ν� �� ����.
	}
	
	public void getAvg() {
		 avg = (double)total/3;
		 System.out.println(name+"���� ����� "+avg);
	}


}
