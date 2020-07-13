package day07;

public class OPTV extends ColorTV {
	
	protected String ip;
	
	public OPTV(String ip, int inch, int color) {
		super(inch,color);
		this.ip = ip;
	}	
	// 오버라이딩. super를 통해서 부모클래스의 메소드를 불러옴. 새로이 작성해도 무방.
	void printProperty() {
		System.out.print("나의 IPTV는"+this.ip+" ");
		super.printProperty();
	}
	
	
}
