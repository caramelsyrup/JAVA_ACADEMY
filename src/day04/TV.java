package day04;

public class TV {
	String str;
	int y;
	int inch;
	
	public TV(String str, int y, int inch) {
		this.str = str;
		this.y = y;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(str+"���� ���� "+y+"�� �� "+inch+"��ġ tv");
		
	}

	public static void main(String[] args) {
		TV tv = new TV("����",2020,60);
		tv.show(); // �������� ���� 2020���� 60��ġ tv
		
		TV mytv = new TV("�Ｚ",2019,55);
		mytv.show();// �Ｚ���� ����  2019���� 55��ġ tv

	}

}
