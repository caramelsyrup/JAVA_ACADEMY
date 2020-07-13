package day09;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "string";
		StringBuilder sb = new StringBuilder(str); // 문자를 동적으로 변경해줌.
		System.out.println(sb);
		sb.append("자바");
		System.out.println(sb);
		sb.insert(0,"위치");	// 0번쨰에 위치 문자열을 추가.
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.delete(2, 5);	// 2번째부터 5번쨰까지 삭제.
		System.out.println(sb);
		sb.reverse();		// 문자열의 순서를 역순으로.
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(3));	// 문자열의 n번째 것을 추출.
		System.out.println(sb.substring(3));	// 3번째부터 추출.
		System.out.println(sb.substring(3,5));	// 3번쨰부터 추출하되 5번쨰에서 멈춤.
		
	}

}
