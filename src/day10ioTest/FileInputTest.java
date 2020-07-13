package day10ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("text.txt");
			while(true) {
				int i = fin.read();	// fin 객체의 메소드 read를 실행. 파일명이 같은것을 읽음.
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
