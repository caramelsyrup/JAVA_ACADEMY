package day07_cooporation;

public class Bus {
	
	private int busNumber;	// ������ȣ
	private int busPassenger;	// �°���
	private int busIncome;	// ����

	public Bus ( int busNumber) {
		this.busNumber = busNumber;
	}
			
			
	 // �°��� ���� ���� ž��
	void take(int busIncome) {
		this.busIncome += busIncome;	// ��������.
		busPassenger++; // �°��� ����
	}
	
	void showInfo() {
		System.out.println("���� : "+busNumber);
		System.out.println("���� �°� : "+busPassenger);
		System.out.println("���� ���� : "+busIncome);
	}





}
