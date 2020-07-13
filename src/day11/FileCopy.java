package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		long millisecond	=	0;
		try 
			(FileInputStream fis = new FileInputStream("text.txt");	// byte 흐름으로 읽음.
			FileOutputStream fos = new FileOutputStream("copy.txt")){
			millisecond = System.currentTimeMillis();	// 파일복사전 시간
			int i;
			while ((i=fis.read())!=-1) { // FileInputStream의 read는 int로 리턴. 내용이 끝이면 -1.
				fos.write(i);
			}
			millisecond= System.currentTimeMillis()-millisecond;	// 파일복사후 시간 구하기
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			System.out.println("파일 복사하는데"+millisecond);
	}

}
