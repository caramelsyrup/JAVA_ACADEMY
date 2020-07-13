package day10ioTest;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		while(true) {
			try {
				int i = System.in.read();	// read는 int형으로 반환. 입력받는 흐름. input stream. 다양하게 읽을수가 없다. Scanner의 활용.
				if(i==-1)break;
				System.out.println((char)i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
