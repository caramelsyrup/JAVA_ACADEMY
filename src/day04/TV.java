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
		System.out.println(str+"에서 만든 "+y+"년 형 "+inch+"인치 tv");
		
	}

	public static void main(String[] args) {
		TV tv = new TV("엘지",2020,60);
		tv.show(); // 엘지에서 만든 2020년형 60인치 tv
		
		TV mytv = new TV("삼성",2019,55);
		mytv.show();// 삼성에서 만든  2019년형 55인치 tv

	}

}
