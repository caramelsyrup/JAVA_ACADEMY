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
	
	ArrayList<Friend> arr = new ArrayList<Friend>();	// while�ȿ� ����, �ݺ��Ǹ鼭 ��� �ʱ�ȭ �Ǹ鼭 �Է��� �Ǳ⿡, ������ �ڷᰡ ���ư�.
	File dir,file;
	public FriendMain() throws IOException, ClassNotFoundException {	
		// public static void main(String[] args)�� ù������ ����ȴ�. �׷��� �����ڸ� ���� ������ �����ϸ� ���ϸ��� ����ǵ��� �Ѵ�. ���⿡�� ����� ������ ������ �迭�� �ִ� �ܰ�.
		dir = new File("src\\day11");	// dir ���� ���� ���.
		file = new File(dir,"myFriend.txt");	// ��ü�� ���� ����.
		if(file.exists()) { // ������ ������?
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));	// file�� �ٷ� ������ �� �� ���⿡, FileInputStream�� �̿�.
			arr = (ArrayList<Friend>) ois.readObject();	// class�� ���� ���� ������ throws ���.
			// arr �迭�� ���� ������ object�� �о ����.
			
		}else {
			file.createNewFile(); // file�� ���� ���܋����� try catch�� ���������, ���⼭�� throws�� ���.
		}
	}                
	
	private void fileUse() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.ģ����� 2.ģ������ 3.����(����)");
			int num = sc.nextInt();
			sc.nextLine();	// ���ÿ� �ߴ� ���� �����ϱ����ؼ� ���͸� �ѹ�.
			if(num==1) {	// ģ�����
				Friend f = new Friend();
				System.out.println("�̸�>>");
				String name = sc.nextLine();
				f.setName(name);
				System.out.println("����>>");
				String birth = sc.nextLine();
				f.setBirth(birth);
				System.out.println("�ּ�>>");
				String addr = sc.nextLine();
				f.setAddr(addr);
				System.out.println("��ȭ>>");
				String tel = sc.nextLine();
				f.setTel(tel);
				
				arr.add(f); 	// friend ��ü �迭�� arr�� f��ü�� �ִ´�. �Էµ� �ڷᰡ ���õ�.
				
			}else if(num==2) {	// ģ������
				
				for(Friend a : arr) {
					System.out.println(a.getName());
					System.out.println(a.getBirth());
					System.out.println(a.getAddr());
					System.out.println(a.getTel());
				}
				
			}else if(num==3) {	// ����,���� ( ��ü�� �������� ����.)
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				// throws�� ���ؼ� ���ܸ� ������. ������ ��� ������ �ɸ����� �˼� ���� ����. 
				oos.writeObject(arr);	
				// �̴�δ� ������ ������ ����� �ȵȴ�. ������ ����Ʈ�� ����. Friend�� �����ؼ� Serializable�� implements�� ����� ����Ʈ �帧���� ��ȯ.
				// �����¿����� ����Ʈ �帧�̱⿡ ������ ����. oos ��ü�� �ż��带 ����ؼ� �迭 arr�� ������ ����. ���� "file"�� ����.
				System.out.println("����");
				System.exit(0);
			}else {	// �Է¿���
				System.out.println("�Է¿���");
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FriendMain fm = new FriendMain();	// 	FriendMain�� �޼ҵ忡 throws�� �ֱ⿡, ��ü�� �̿��ϴ� �������� throws�� �ʿ�.
		fm.fileUse();
		

	}

}
