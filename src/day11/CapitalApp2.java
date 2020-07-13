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
	
	private HashMap<String, String> map = new HashMap<String, String>();	// 해쉬 맵 형으로 map를 만듦.
	File dir,file;													// 파일,폴더 만듦.	
	
	public CapitalApp2() {													// 초기화
		dir = new File("src\\day11");	
		file = new File(dir,"myCapital.txt");
		
		map.clear();	// map을  초기화.
		try {
			if(!file.exists()) {
					file.createNewFile();
					return;
			}
			Scanner scan = new Scanner(file); // 파일 불러오는 scanner
			while(scan.hasNext()) { 
				// sca에서 내용이 있는가?
				String country = scan.next();
				String city = scan.next();
				map.put(country, city);
			}
			scan.close();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}

		private void input() {		// 입력.
			System.out.println("현재 "+map.size()+" 개 나라와 수도 입력");	// map에 입력 상태를 알려줌.
				while(true) {
					System.out.println("나라와 수도 입력(종료는 x)>>>");	// 입력 안내문.
					String coun = CapitalApp.sc.next();				// key는 나라. 입력설정.
					if(coun.toLowerCase().equals("x")) break;		// x누르면 종료되도록.
					if(map.containsKey(coun)) {						// map의 key값과 입력값 비교
						System.out.println("이미 입력된 나라임.");		// 안내문.
						continue;									// while 다시 반복.
					}
					String cap	=	CapitalApp.sc.next();			// key가 새로운 값이면, value에 입력하라.
					map.put(coun, cap);								// 입력된 값들을 key와 value에 넣기.
					
				}
		}
		private void quiz() {
			Set<String> exam = map.keySet();	// HashMap을 Set으로, map의 key값만의 세트로 순서없고, 중복없는.
			Object[] ex = exam.toArray();		// Object클래스 배열을 만듦. set의 toArray를 사용. 배열화.
			while(true) {
				int n =(int) (Math.random()*map.size()); // n에 랜덤수를 넣는다.
//				if(map.size() == 0) return;
//				if(map.isEmpty()) return;
				String country ="";
				try {
					country = (String) ex[n]; // country에 ex배열의 n번쨰를 넣는다.
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("map가 비어있습니다.");
					return;
				}
				String city	   = map.get(country);	// 위의 ex배열에 존재하는 key값을 저장. 해당 key의  value를 저장.
				// 문제출제.
				System.out.println(country+"의 수도는? 종료는 x>>");
				String en = CapitalApp.sc.next();
					if(en.toLowerCase().equals("x")) break;
					if(en.equals(city)) {
						System.out.println("정답");
					}else {
						System.out.println("오답");
				}
			}
		}
		private void save() {	// 현재 객체형태가 아니기에, 각각을 보내야함.
			FileWriter fw	=	null;
			try {
				fw = new FileWriter(file);
				Set<String>set = map.keySet();	// 나라만 가져옴.
				Iterator<String> it = set.iterator();	// 나라를 방문하기 위해
					while(it.hasNext()) {
						String key = it.next();	//나라 가져옴.
						String value	=	map.get(key);	// 수도 가져옴.
						fw.write(key);				//나라 출력
						fw.write(value);			//수도 출력
					}
					fw.close();
					System.out.println("종료");
					System.exit(0);
					
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("파일 저장 오류");
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
				System.out.println("입력오류");
			}
		}

	}

}
