package day04;

public class StudentMain {
	
	public static void main(String[] args) {
		// �̸� ȫ�浿, ���� ����, ��� ���. 100,80,70
		StudentScore s1 = new StudentScore("ȫ�浿",100,80,70);	// �����ڸ� �̿��ϴ� ���� �� �� ����.
		
		System.out.println(s1.getTotal());	// �ش� �޼ҵ尡 return���� �����⿡ ����� �ȴ�.
		s1.getAvg();	// return������ �޼ҵ忡�� ��±��� ��� ����.
		
		
	}
}
