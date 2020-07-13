package day08_interface;

public class Km2Mile extends Converter {
	
	public Km2Mile(double km) {
		super.ratio = km;
	}

	@Override
	double convert(double src) {
		// �ƹ��� Ŭ������ �߻��̶�, �������̵带 ���� ��üȭ �ʿ�. Main���� �޼ҵ� �����, �Ƶ�Ŭ������ �ش� Ŭ������ �޼ҵ尡 ���� ����.
		return src/ratio;
	}

	@Override
	String srcString() {
		// TODO Auto-generated method stub
		return "km";
	}

	@Override
	String destString() {
		// TODO Auto-generated method stub
		return "mile";
	}
}
