package day10ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream("output.txt");
				FileOutputStream ffos = new FileOutputStream("text.txt");
				
				System.out.println(fis.read());
				System.out.println(fis.read());
				System.out.println(fis.read());
				int i;
				while((i=fis.read())!=-1) {
					System.out.print((char)fis.read());
					ffos.write(i);
				}
				
			}catch(IOException e) {
				System.out.println(e);
			} finally {
				try {
					fis.close();
				} catch(IOException e) {
					System.out.println(e);
				} catch(NullPointerException e) {
					System.out.println(e);
				}
			}
			System.out.println("end");	// ����� ��. �߰��� ���ܻ�Ȳ�� �߻�������, ������ ������ �Ǿ���.
	}

}
