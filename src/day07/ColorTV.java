package day07;

public class ColorTV extends TV {
	
	protected int color;
	
	public ColorTV(int inch, int color) {
		super(inch);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(this.inch+"인치 "+this.color+" 컬러");
	}
	
}
