package day05_object;

public class StudentBean {
	
	String name;
	int kor,eng,math;
	int rank=1;	// 순위의 초기값은 1이다.

	public StudentBean(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		return (double)((kor+eng+math)/3);
	}
	
	public void setRank(int rank) {	// 순위가 수치씩 적립되는 방식을 함수로.
		this.rank += rank;
	}
}
