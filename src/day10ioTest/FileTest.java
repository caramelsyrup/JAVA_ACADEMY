package day10ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		try {
			FileReader fis = new FileReader("src\\day10_Thread\\SaramTalk.java");	// �ش� ������ ��ġ�� �Ű�������, fis ��ü ����. �ѱ��� ������ FileReader���.
			FileOutputStream fos = new FileOutputStream("output.txt");	// �ش� ������ �����Ѵ�. ������ �����鼭.
			int c;
			while((c=fis.read())!=-1) {				// fis��ü�� ����� read�� ���ؼ� �Ű������� ������ �о� ��� c�� ����. int���·� ����ȴ�.
				System.out.print((char)c);			// int c�̱⿡, ���� ���� char�� ���� ��ȯ.
				fos.write(c);						// fos��ü�� �ִ� write�� ���. ���Ϸ� ������ ������. �ѱ��� �ȱ���. �ѱ�����.
			}

		} catch (FileNotFoundException e) {			// ����ó��, ���� �߰��� ���ҋ�.
			e.printStackTrace();
		} catch (IOException e) {					// ����ó�� �����.
			e.printStackTrace();
		}

	}

}
