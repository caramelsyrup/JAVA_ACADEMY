package day09;

public class StringTest {

	public static void main(String[] args) {	
		String str = "�ȳ�";		// new�� ���ؼ� ���ο� ��ü�� �������� �ʾƵ� �ȴ�. String�� Ư¡.
		String str1 = "�ȳ�";		// str���� �̹� ���� ���ڿ��� �־, ������ �������� �ʴ´�.
		String tmp = new String("�ȳ�");		// new�� ���ؼ� �����, �������� �ʾƵ� ������ �Ҵ��Ͽ� ����.
		
		if(str==str1) {	// ���� �񱳸� ==���� �ص� ����. ����� ����.
			System.out.println("�ּҰ� ����. T");
		}else {
			System.out.println("F");
		}
		// == �� �¿��� �ּҰ� �������� ���� ��.
		// equals�� �¿��� ������ �������� ���� ��.
		
		if(str==tmp) {	// ���� �񱳸� ==���� �ص� ����. ����� ����.
			System.out.println("�ּҰ� ����. T");
		}else {
			System.out.println("�ּҰ� �ٸ���. F");
		}
		
		if(str.equals(tmp)) {	// ���� �񱳸� ==���� �ص� ����. ������ ����� �ٸ���.
 			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		str = str + str1;	// ������ �ٲ�鼭, �ּҰ� �޶���.
		if(str==str1) {
			System.out.println("�ּҰ� ����. T");
		}else {
			System.out.println("�ּҰ� �ٸ��� F");
		}
		
//		String Ŭ������ ����Ŭ�����̴�. ������ ����Ǵ� Ŭ������ �ƴϴ�. ������ ��� ���� ����⸦ �ݺ��ϸ�, ���α׷��� �δ�.
//		�׷��� ���� Ŭ������ StringBuilder buffer ���. ���ڿ��� ������ ���� �۾��� ���.
	}
	
}
