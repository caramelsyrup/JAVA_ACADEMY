package day08_interface;

public class Won2Dollar extends Converter {
	
	public Won2Dollar(int won) {
		super.ratio = won;
		
	}

	@Override
	double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	String srcString() {
		// TODO Auto-generated method stub
		return "¿ø";
	}

	@Override
	String destString() {
		// TODO Auto-generated method stub
		return "´Þ·¯";
	}

}
