package day10;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HashMap<String,String> dic = new HashMap<String,String>();
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		while(true) {
			try {		
					System.out.println("���� �ܾ �Է��ϼ���.");
					String en = sc.next();
					
					if(en.toLowerCase().equals("exit")) {
						break;
					}
					
					String kor = dic.get(en);
					if(kor == null) {
						System.out.println("���� �ܾ�");
					}else {
						System.out.println(dic.get(en));
						break;
					}
			}
			catch(NullPointerException e){
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			finally {
				sc.nextLine();
			}
		}
		
	}
}
