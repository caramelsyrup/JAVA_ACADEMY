package day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map	=	new HashMap<String, String>();
		
		map.put("java", "1111");
		map.put("oracle", "1234");
		map.put("jsp", "abcd");
		// ���� �����ͺ��̽��� ���̵�� ����� ����.
		System.out.println("���̵� �Է��ϼ���.");
		String userID = sc.nextLine();
		System.out.println("�н����带 �Է��ϼ���.");
		String userPassword = sc.nextLine();
		// id�� �Է��ϴ� ����.
/*		if(map.containsKey(userID)) {	// id �����.
			System.out.println("�н����带 �Է��ϼ���.");
			String userPassword = sc.nextLine();	// id�� �±⿡, ����� ���.
			if(map.containsValue(userPassword)) {	// ��� ����.
				System.out.println("�α��� ����.");		// ��� ������ �α��� ����.
			}else {							
				System.out.println("�н����尡 �߸��Ǿ����ϴ�.");	// �н����� �߸�.
			}
		}else {
			System.out.println("���̵� �߸��Ǿ����ϴ�.");		// ���̵� �߸�.
		}
*/
		if(map.containsKey(userID)==false){
			System.out.println("���̵� �����ϴ�.");
		}else if(map.get(userID).equals(userPassword)==false) {	// �ش� Ű�� ���� �װ��� �������� �Էµ� userPassword�� ��ġ�ϴ��� ��.
			System.out.println("��й�ȣ�� ����ġ.");
		}else {
			System.out.println("�α��μ���");
		}
	
	sc.close();
	}
	
}
