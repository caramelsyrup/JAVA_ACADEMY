package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Output {
	
	Scanner sc = null;	// 지역변수에 초기값 설정 해놓음.
	static PrintStream ps = null;	// 콘솔의 내용을 읽어서 파일로 내보낼 수 있음. PrintStream
	public static void main(String[] args) {
		
/*		try {
			FileReader fir = new FileReader("src\\day11\\input.txt");	// 한글까지 읽어 내기 위해서, FileReader 클래스 사용.
			int c;
			while((c=fir.read())!=-1) {	// read()는 end시에 -1을 리턴함.
				System.out.print((char)c);	// c는 int이기에 강제 char로 변환
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/	
	try {

			FileInputStream fis = new FileInputStream("src\\day11\\input.txt");
			// input파일의 내용을 한줄로 읽어 들여서 출려.
			Scanner sc = new Scanner(new File("src\\day11\\input.txt"));
			// File객체를 하나 만들고, 경로 지정된 파일을 읽도록 함. 파일이 없을 수도 있기에, try~catch문 도 작성이 됨.
			ps = new PrintStream("src\\day11\\input-16.txt");
			// PrintStream 객체를 통해서  파일을 생성하여, 콘솔 내용을 저장.
			while(sc.hasNext()) {
				String i = sc.nextLine();
				String[] str = i.split(":");	// : 단위로 끊어 내어서 배열에 저장. split 메소드는 배열 리턴값.
				for(String st : str) {
//					System.out.print(st+"\t"); // 내용 출력.
//					System.out.print(Integer.toHexString(Integer.parseInt(st))+"\t");	// 16진수로 출력. String으로 리턴 됨.
					// 현재 String클래스의 형태 .Integer 클래스 사용하여 변경. Integer클래스의 parseInt메소드를 이용. String을 넣으면 10진수 Integer가 리턴.
					System.out.print(Integer.toHexString(Integer.parseInt(st)).toUpperCase()+"\t");
					//영문자가 대문자로 출력. 16진수는 String으로 리턴됨.
					ps.print(Integer.toHexString(Integer.parseInt(st)).toUpperCase()+"\t");
					// print를 통해서 내용을 파일로 저장.
				}
				
//				System.out.print(i+"\t");		// 
				
//				int i = fis.read();	//바이트 단위로 읽어 들임.
//				if(i == -1) break;
//				System.out.print((char)i);
				

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}

}
