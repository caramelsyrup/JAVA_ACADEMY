package day10ioTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("text.txt");	// FileOutputStream�� ��ü fs�� ����. ������ ���������ν� ���.
			while(true) {
				int i = System.in.read();	// �ܼ� â���� �Է�.
				if(i==1) break;				
				fs.write(i);	// ȭ�鿡 ����ϴ� ���� �ƴϰ�, text.txt������ ������ �ȴ�.
			}
			fs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}
