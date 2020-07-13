package day09;

public class StringTest {

	public static void main(String[] args) {	
		String str = "안녕";		// new를 통해서 새로운 객체를 생성하지 않아도 된다. String의 특징.
		String str1 = "안녕";		// str에서 이미 동일 문자열이 있어서, 새로이 생성하지 않는다.
		String tmp = new String("안녕");		// new를 통해서 만들면, 동일하지 않아도 새로이 할당하여 생성.
		
		if(str==str1) {	// 둘의 비교를 ==으로 해도 가능. 결과가 같다.
			System.out.println("주소가 같다. T");
		}else {
			System.out.println("F");
		}
		// == 는 좌우의 주소가 같은지를 묻는 것.
		// equals는 좌우의 내용이 같은지를 묻는 것.
		
		if(str==tmp) {	// 둘의 비교를 ==으로 해도 가능. 결과가 같다.
			System.out.println("주소가 같다. T");
		}else {
			System.out.println("주소가 다르다. F");
		}
		
		if(str.equals(tmp)) {	// 둘의 비교를 ==으로 해도 가능. 하지만 결과가 다르다.
 			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		str = str + str1;	// 내용이 바뀌면서, 주소가 달라짐.
		if(str==str1) {
			System.out.println("주소가 같다. T");
		}else {
			System.out.println("주소가 다르다 F");
		}
		
//		String 클래스는 정적클래스이다. 내용이 변경되는 클래스가 아니다. 하지만 계속 쓰고 지우기를 반복하면, 프로그램에 부담.
//		그래서 동적 클래스인 StringBuilder buffer 사용. 문자열의 수정이 잦은 작업의 경우.
	}
	
}
