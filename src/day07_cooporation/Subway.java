package day07_cooporation;

public class Subway {
	private String subNumber;	// ����ö��ȣ
	private int subPassenger;	// �°���
	private int subIncome;	// ����

	public Subway(String subNumber) {
		this.subNumber = subNumber;
	}
	
	
	 // �°��� ���� ���� ž��
	void take(int subIncome) {
		this.subIncome += subIncome;	// ��������.
		subPassenger++; // �°��� ����
	}
	
	void showInfo() {
		System.out.println("����ö : "+subNumber);
		System.out.println("����ö �°� : "+subPassenger);
		System.out.println("����ö ���� : "+subIncome);
	}
}
