package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		long millisecond	=	0;
		try 
			(FileInputStream fis = new FileInputStream("text.txt");	// byte �帧���� ����.
			FileOutputStream fos = new FileOutputStream("copy.txt")){
			millisecond = System.currentTimeMillis();	// ���Ϻ����� �ð�
			int i;
			while ((i=fis.read())!=-1) { // FileInputStream�� read�� int�� ����. ������ ���̸� -1.
				fos.write(i);
			}
			millisecond= System.currentTimeMillis()-millisecond;	// ���Ϻ����� �ð� ���ϱ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			System.out.println("���� �����ϴµ�"+millisecond);
	}

}
