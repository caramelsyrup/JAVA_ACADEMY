package day09;

public class StringTest3 {
	public static void main(String[] args) {
		String tmp = "1 0 15 23 6 21 17 10 11 12 13 14";
		// tmp ����
		
		System.out.println("���ڿ��� ���� : "+tmp.length());
		
		String[] s = tmp.split(" ");
		// " "�� �迭�� ������ ������ �ȴ�.
		System.out.println(s.length);
		// �迭�� ���� ���
		
		for(String ad : s) {
			System.out.println(ad);
		}
		System.out.println("----------------------------");
		System.out.println(Integer.toHexString(15));
		// s�迭�� ��� �ִ� ���ڸ� 16������ ����
		
		String oct ="";
		String hex ="";
		for(int i=0; i<s.length; i++) {
			hex += Integer.toHexString(Integer.parseInt(s[i]))+"\t";
			oct += Integer.toOctalString(Integer.parseInt(s[i]))+"\t";
		}
		System.out.println();
//		for(int i=0; i<s.length; i++) {
//			System.out.print(Integer.toOctalString(Integer.parseInt(s[i])).toUpperCase()+"\t");
//		}
//		System.out.println();
		for(String ss : s) {
			System.out.print(Integer.toOctalString(Integer.parseInt(ss)).toUpperCase()+"\t");
		}
		System.out.println();
		
	}
}
