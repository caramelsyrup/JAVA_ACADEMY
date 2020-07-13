package day10ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("text.txt");
			while(true) {
				int i = fin.read();	// fin ��ü�� �޼ҵ� read�� ����. ���ϸ��� �������� ����.
				if(i==-1) break;
				System.out.print((char)i);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
