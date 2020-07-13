package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendMain {
	
	ArrayList<Friend> arr = new ArrayList<Friend>();	// while안에 들어가면, 반복되면서 계속 초기화 되면서 입력이 되기에, 이전의 자료가 날아감.
	File dir,file;
	public FriendMain() throws IOException, ClassNotFoundException {	
		// public static void main(String[] args)가 첫번쨰로 실행된다. 그래서 생성자를 만들어서 파일을 실행하면 제일먼저 실행되도록 한다. 여기에서 저장된 파일의 내용을 배열에 넣는 단계.
		dir = new File("src\\day11");	// dir 만들어서 폴더 경로.
		file = new File(dir,"myFriend.txt");	// 구체적 파일 생성.
		if(file.exists()) { // 파일이 있으면?
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));	// file에 바로 접근을 할 수 없기에, FileInputStream을 이용.
			arr = (ArrayList<Friend>) ois.readObject();	// class가 없을 예외 떄문에 throws 사용.
			// arr 배열에 기존 파일의 object를 읽어서 보냄.
			
		}else {
			file.createNewFile(); // file이 없을 예외떄문에 try catch를 헤야하지만, 여기서는 throws를 사용.
		}
	}                
	
	private void fileUse() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.친구등록 2.친구보기 3.종료(저장)");
			int num = sc.nextInt();
			sc.nextLine();	// 동시에 뜨는 것을 방지하기위해서 엔터를 한번.
			if(num==1) {	// 친구등록
				Friend f = new Friend();
				System.out.println("이름>>");
				String name = sc.nextLine();
				f.setName(name);
				System.out.println("생일>>");
				String birth = sc.nextLine();
				f.setBirth(birth);
				System.out.println("주소>>");
				String addr = sc.nextLine();
				f.setAddr(addr);
				System.out.println("전화>>");
				String tel = sc.nextLine();
				f.setTel(tel);
				
				arr.add(f); 	// friend 객체 배열인 arr에 f객체를 넣는다. 입력된 자료가 세팅된.
				
			}else if(num==2) {	// 친구보기
				
				for(Friend a : arr) {
					System.out.println(a.getName());
					System.out.println(a.getBirth());
					System.out.println(a.getAddr());
					System.out.println(a.getTel());
				}
				
			}else if(num==3) {	// 종료,저장 ( 객체를 내보내는 개념.)
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				// throws를 통해서 예외를 날린다. 하지만 어디서 오류가 걸리는지 알수 없는 단점. 
				oos.writeObject(arr);	
				// 이대로는 내용이 전달이 제대로 안된다. 파일은 바이트로 저장. Friend에 접근해서 Serializable를 implements를 하줘야 바이트 흐름으로 변환.
				// 현상태에서는 바이트 흐름이기에 내용이 꺠짐. oos 객체의 매서드를 사용해서 배열 arr의 내용을 저장. 위의 "file"에 저장.
				System.out.println("종료");
				System.exit(0);
			}else {	// 입력오류
				System.out.println("입력오류");
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FriendMain fm = new FriendMain();	// 	FriendMain의 메소드에 throws가 있기에, 객체를 이용하는 곳에서도 throws가 필요.
		fm.fileUse();
		

	}

}
