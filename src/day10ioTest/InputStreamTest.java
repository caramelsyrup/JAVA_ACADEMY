package day10ioTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("text.txt");	// FileOutputStream의 객체 fs를 설정. 파일을 생성함으로써 출력.
			while(true) {
				int i = System.in.read();	// 콘솔 창에서 입력.
				if(i==1) break;				
				fs.write(i);	// 화면에 출력하는 것이 아니고, text.txt파일이 생성이 된다.
			}
			fs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}
