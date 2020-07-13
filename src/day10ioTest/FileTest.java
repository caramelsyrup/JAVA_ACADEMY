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
			FileReader fis = new FileReader("src\\day10_Thread\\SaramTalk.java");	// 해당 파일의 위치를 매개변수로, fis 객체 생성. 한글이 깨져서 FileReader사용.
			FileOutputStream fos = new FileOutputStream("output.txt");	// 해당 파일을 생성한다. 내용을 보내면서.
			int c;
			while((c=fis.read())!=-1) {				// fis객체에 내장된 read를 통해서 매개변수인 파일을 읽어 내어서 c에 저장. int형태로 저장된다.
				System.out.print((char)c);			// int c이기에, 문자 형태 char로 강제 변환.
				fos.write(c);						// fos객체에 있는 write를 사용. 파일로 내용을 내보냄. 한글이 안깨짐. 한굴지원.
			}

		} catch (FileNotFoundException e) {			// 예외처리, 파일 발견을 못할떄.
			e.printStackTrace();
		} catch (IOException e) {					// 예외처리 입출력.
			e.printStackTrace();
		}

	}

}
