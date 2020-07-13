package day06;

public class StudentBean {
	
	private String name;
	private int kor,eng,math;
	private int rank=1;	// ������ �ʱⰪ�� 1�̴�.

	public StudentBean(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		return (double)((kor+eng+math)/3);
	}
	
	public void setRank(int rank) {	// ������ ��ġ�� �����Ǵ� ����� �Լ���.
		this.rank += rank;
	}
}
