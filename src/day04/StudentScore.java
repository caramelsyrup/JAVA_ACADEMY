package day04;

public class StudentScore {
	String name;
	int kor;
	int math;
	int eng;
	
	int total;
	double avg;
	
	public StudentScore(String name, int kor, int math, int eng ) {	// 생성자를 사용.
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	
	}	// StudentMain에서 다른 활용이 없기에, 디톨트 되는 생성자는 작성 안함.
	
	public String getTotal () {
		total = kor+math+eng;
	//	System.out.println(name+"님의 총점은 "+total);
		return name+"님의 총점은 "+total;	// return 값을 유도한다. 해당 함수를 값으로써 쓸 예정.
	}
	
	public void getAvg() {
		 avg = (double)total/3;
		 System.out.println(name+"님의 평균은 "+avg);
	}


}
