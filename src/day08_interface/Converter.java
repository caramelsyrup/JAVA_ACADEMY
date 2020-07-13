package day08_interface;

import java.util.Scanner;

public abstract class Converter {	//아버지 클래스. 추상으로 만들어 놓았음. Main파일에서 실행하면, 아들클래스를 실행하면서 같이 실행이 됨.
	abstract double convert(double src);
	abstract String srcString();
	abstract String destString();
	Scanner scanner = new Scanner(System.in);
	protected double ratio;
	
	public void run() {	//교환기능.
		System.out.println(srcString()+"을 "+destString()+"로 바꿉니다.");
		System.out.println(srcString()+"을 입력하세요.");
	//	double val = scanner.nextDouble();
		double res = convert(scanner.nextDouble());	// 매개변수를 아버지 클래스의 메소드에 입력받음.
		System.out.println("변환 결과 : "+res+destString()+"입니다.");
		
	}
}
