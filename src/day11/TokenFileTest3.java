package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenFileTest3 {

	public static void main(String[] args) {
		// input.txt 파일 읽고, 8진수 변환 octal.txt 파일로 출력.
		// StringTokenizer 사용.
//		FileInputStream fis = new FileInputStream("src\\day11\\input.txt");
		try {
			Scanner fis = new Scanner(new File("src\\day11\\input.txt"));	// File 객체를 이용하게 유도.
			PrintStream ps	= new PrintStream("src\\day11\\octal.txt");
			
			while(fis.hasNext()) {
				String i = fis.nextLine();
				StringTokenizer stk = new StringTokenizer(i,":");
				
				while(stk.hasMoreTokens()) {
//					String tok = stk.nextToken();
//					int v = Integer.parseInt(tok);
				ps.print(Integer.toOctalString(Integer.parseInt(stk.nextToken()))+"\t");
				}
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
