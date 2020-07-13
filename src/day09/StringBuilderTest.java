package day09;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "string";
		StringBuilder sb = new StringBuilder(str); // ���ڸ� �������� ��������.
		System.out.println(sb);
		sb.append("�ڹ�");
		System.out.println(sb);
		sb.insert(0,"��ġ");	// 0������ ��ġ ���ڿ��� �߰�.
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.delete(2, 5);	// 2��°���� 5�������� ����.
		System.out.println(sb);
		sb.reverse();		// ���ڿ��� ������ ��������.
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(3));	// ���ڿ��� n��° ���� ����.
		System.out.println(sb.substring(3));	// 3��°���� ����.
		System.out.println(sb.substring(3,5));	// 3�������� �����ϵ� 5�������� ����.
		
	}

}
