package day07;

public class OPTV extends ColorTV {
	
	protected String ip;
	
	public OPTV(String ip, int inch, int color) {
		super(inch,color);
		this.ip = ip;
	}	
	// �������̵�. super�� ���ؼ� �θ�Ŭ������ �޼ҵ带 �ҷ���. ������ �ۼ��ص� ����.
	void printProperty() {
		System.out.print("���� IPTV��"+this.ip+" ");
		super.printProperty();
	}
	
	
}
