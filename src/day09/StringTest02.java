package day09;

public class StringTest02 {
	public static void main(String[] args) {
		
		String str = "�ȳ��ϼ���. Hello. �ڹ� ������!";
		System.out.println("str ���� : "+str.length());
		System.out.println("H��ġ : "+str.indexOf('H'));
		System.out.println("Hello ��ġ ������ : "+str.indexOf("Hello"));
		System.out.println("4��° ���� : "+str.charAt(4));	// ������ 0���� ����.
		
		String tmp = "������ �սô�.";
		System.out.println("str�� tmp ���� : "+str.concat(tmp));	// ���� �޼��� concat
		System.out.println("str�� tmp ���� : "+tmp.concat(str));
		
		int value =7;
		System.out.println("str�� value ���� : "+str.concat(String.valueOf(value)));	
		// contcat�� �⺻�� String������. �׷��� String�� �޼��� valueOf�� �̿��ؼ� int���� ������ String������ �ٲ�.
		// String s = String.valueOf(value); �ѵ� s�� �־ �ȴ�. str.concat(s)�� �ᵵ �ȴ�.
		
		String msg = "abcdefg";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		
		String[] arr = str.split(" ");
		// String arr[] �� �´� ǥ��.
		for( String ar:arr) {
			System.out.println(ar);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.length);
	}
}
