package day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import day10.CapitalApp;

public class CapitalApp2 {
	
	private HashMap<String, String> map = new HashMap<String, String>();	// �ؽ� �� ������ map�� ����.
	File dir,file;													// ����,���� ����.	
	
	public CapitalApp2() {													// �ʱ�ȭ
		dir = new File("src\\day11");	
		file = new File(dir,"myCapital.txt");
		
		map.clear();	// map��  �ʱ�ȭ.
		try {
			if(!file.exists()) {
					file.createNewFile();
					return;
			}
			Scanner scan = new Scanner(file); // ���� �ҷ����� scanner
			while(scan.hasNext()) { 
				// sca���� ������ �ִ°�?
				String country = scan.next();
				String city = scan.next();
				map.put(country, city);
			}
			scan.close();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}

		private void input() {		// �Է�.
			System.out.println("���� "+map.size()+" �� ����� ���� �Է�");	// map�� �Է� ���¸� �˷���.
				while(true) {
					System.out.println("����� ���� �Է�(����� x)>>>");	// �Է� �ȳ���.
					String coun = CapitalApp.sc.next();				// key�� ����. �Է¼���.
					if(coun.toLowerCase().equals("x")) break;		// x������ ����ǵ���.
					if(map.containsKey(coun)) {						// map�� key���� �Է°� ��
						System.out.println("�̹� �Էµ� ������.");		// �ȳ���.
						continue;									// while �ٽ� �ݺ�.
					}
					String cap	=	CapitalApp.sc.next();			// key�� ���ο� ���̸�, value�� �Է��϶�.
					map.put(coun, cap);								// �Էµ� ������ key�� value�� �ֱ�.
					
				}
		}
		private void quiz() {
			Set<String> exam = map.keySet();	// HashMap�� Set����, map�� key������ ��Ʈ�� ��������, �ߺ�����.
			Object[] ex = exam.toArray();		// ObjectŬ���� �迭�� ����. set�� toArray�� ���. �迭ȭ.
			while(true) {
				int n =(int) (Math.random()*map.size()); // n�� �������� �ִ´�.
//				if(map.size() == 0) return;
//				if(map.isEmpty()) return;
				String country ="";
				try {
					country = (String) ex[n]; // country�� ex�迭�� n������ �ִ´�.
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("map�� ����ֽ��ϴ�.");
					return;
				}
				String city	   = map.get(country);	// ���� ex�迭�� �����ϴ� key���� ����. �ش� key��  value�� ����.
				// ��������.
				System.out.println(country+"�� ������? ����� x>>");
				String en = CapitalApp.sc.next();
					if(en.toLowerCase().equals("x")) break;
					if(en.equals(city)) {
						System.out.println("����");
					}else {
						System.out.println("����");
				}
			}
		}
		private void save() {	// ���� ��ü���°� �ƴϱ⿡, ������ ��������.
			FileWriter fw	=	null;
			try {
				fw = new FileWriter(file);
				Set<String>set = map.keySet();	// ���� ������.
				Iterator<String> it = set.iterator();	// ���� �湮�ϱ� ����
					while(it.hasNext()) {
						String key = it.next();	//���� ������.
						String value	=	map.get(key);	// ���� ������.
						fw.write(key);				//���� ���
						fw.write(value);			//���� ���
					}
					fw.close();
					System.out.println("����");
					System.exit(0);
					
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("���� ���� ����");
			}
		}
	public static void main(String[] args) {
		CapitalApp2 ca2 = new CapitalApp2();
		while(true) {
			CapitalApp.showMenu();
			int choice = CapitalApp.sc.nextInt();
			switch(choice) {
			case 1:
				ca2.input(); break;
			case 2:
				ca2.quiz(); break;
			case 3:
				ca2.save(); break;
			default :
				System.out.println("�Է¿���");
			}
		}

	}

}
