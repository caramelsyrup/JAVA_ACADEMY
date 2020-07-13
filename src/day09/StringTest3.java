package day09;

public class StringTest3 {
	public static void main(String[] args) {
		String tmp = "1 0 15 23 6 21 17 10 11 12 13 14";
		// tmp 길이
		
		System.out.println("문자열의 길이 : "+tmp.length());
		
		String[] s = tmp.split(" ");
		// " "이 배열을 나누는 기준이 된다.
		System.out.println(s.length);
		// 배열의 길이 출력
		
		for(String ad : s) {
			System.out.println(ad);
		}
		System.out.println("----------------------------");
		System.out.println(Integer.toHexString(15));
		// s배열에 들어 있는 숫자를 16진수로 변경
		
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
