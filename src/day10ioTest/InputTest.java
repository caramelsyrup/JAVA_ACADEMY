package day10ioTest;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		while(true) {
			try {
				int i = System.in.read();	// read�� int������ ��ȯ. �Է¹޴� �帧. input stream. �پ��ϰ� �������� ����. Scanner�� Ȱ��.
				if(i==-1)break;
				System.out.println((char)i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
