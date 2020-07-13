package day08_interface;

public class Km2Mile extends Converter {
	
	public Km2Mile(double km) {
		super.ratio = km;
	}

	@Override
	double convert(double src) {
		// 아버지 클래스가 추상이라서, 오버라이드를 통해 구체화 필요. Main에서 메소드 실행시, 아들클래스인 해당 클래스의 메소드가 실행 가능.
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
