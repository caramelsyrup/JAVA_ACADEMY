package day10;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	public static Scanner sc = new Scanner(System.in);
	private HashMap<String, String> map = new HashMap<String, String>();	// ������ ����. �迭�� �������Ѵ�.
	public CapitalApp() {	// ������ 
		map.put("�ѱ�", "����");
		map.put("�Ϻ�", "����");
		map.put("�߱�", "����¡");
		map.put("�̱�", "������");
		map.put("����", "����");
		map.put("������", "�ĸ�");
		map.put("����", "������");
	}	// �ؽ� ���� ������ ����. �迭�� ��� ��� �Ѵ�.

	public static void showMenu() {
		System.out.println("===������ ���� ���߱� ������ �����մϴ�.===");
		System.out.println("�Է� : 1 , ���� : 2, ���� : 3 >>>");
	}
	public void input() {
		System.out.println("���� "+map.size()+" �� ����� ���� �Է�");
		while(true) {
			System.out.println("����� ���� �Է�(����� x)>>");
			String cont = sc.next();
			if(cont.toUpperCase().equals("X")) break;	// �Է¹޴� ���� �׻� �빮��.�ݺ��� ����.
			if(map.containsKey(cont)) {
				System.out.println("�̹� �Է��� �����Դϴ�.");
				continue;	// �ݺ����� �ٽ� �����ض�.
			}
			String sudo = sc.next(); // ���� �߰�.
			map.put(cont, sudo);
			
		}
	}
	private void test() {
		Set<String> set = map.keySet(); // Set�� �ߺ��� ���ʴ� �迭�� ��ȯ.
		System.out.println();
		Object[] arr = set.toArray();	// set�� �迭 ���·� ��ȯ(������ �˱� ���ؼ�)
		while(true) {
			int n =(int) (Math.random()*map.size());	// 0<n<1 = 0<n<7
			//���� �̸�, �����̸� ����.
			String country = (String) arr[n];
			String city	   = map.get(country);
		
			// ��������.
			System.out.println(country+"�� ������? ����� x>>");
			String en = sc.next();
				if(en.toLowerCase().equals("x")) break;
				if(en.equals(city)) {
					System.out.println("����");
				}else {
					System.out.println("����");
			}
		}
	}

	public static void main(String[] args) {
		CapitalApp ca = new CapitalApp();
		while(true) {
			CapitalApp.showMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ca.input(); break;
			case 2:
				ca.test(); break;
			case 3:
				System.out.println("����");
				System.exit(0);
			default :
				System.out.println("�Է¿���");
			}
		}

	}

}
