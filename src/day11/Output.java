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
	
	Scanner sc = null;	// ���������� �ʱⰪ ���� �س���.
	static PrintStream ps = null;	// �ܼ��� ������ �о ���Ϸ� ������ �� ����. PrintStream
	public static void main(String[] args) {
		
/*		try {
			FileReader fir = new FileReader("src\\day11\\input.txt");	// �ѱ۱��� �о� ���� ���ؼ�, FileReader Ŭ���� ���.
			int c;
			while((c=fir.read())!=-1) {	// read()�� end�ÿ� -1�� ������.
				System.out.print((char)c);	// c�� int�̱⿡ ���� char�� ��ȯ
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/	
	try {

			FileInputStream fis = new FileInputStream("src\\day11\\input.txt");
			// input������ ������ ���ٷ� �о� �鿩�� ���.
			Scanner sc = new Scanner(new File("src\\day11\\input.txt"));
			// File��ü�� �ϳ� �����, ��� ������ ������ �е��� ��. ������ ���� ���� �ֱ⿡, try~catch�� �� �ۼ��� ��.
			ps = new PrintStream("src\\day11\\input-16.txt");
			// PrintStream ��ü�� ���ؼ�  ������ �����Ͽ�, �ܼ� ������ ����.
			while(sc.hasNext()) {
				String i = sc.nextLine();
				String[] str = i.split(":");	// : ������ ���� ��� �迭�� ����. split �޼ҵ�� �迭 ���ϰ�.
				for(String st : str) {
//					System.out.print(st+"\t"); // ���� ���.
//					System.out.print(Integer.toHexString(Integer.parseInt(st))+"\t");	// 16������ ���. String���� ���� ��.
					// ���� StringŬ������ ���� .Integer Ŭ���� ����Ͽ� ����. IntegerŬ������ parseInt�޼ҵ带 �̿�. String�� ������ 10���� Integer�� ����.
					System.out.print(Integer.toHexString(Integer.parseInt(st)).toUpperCase()+"\t");
					//�����ڰ� �빮�ڷ� ���. 16������ String���� ���ϵ�.
					ps.print(Integer.toHexString(Integer.parseInt(st)).toUpperCase()+"\t");
					// print�� ���ؼ� ������ ���Ϸ� ����.
				}
				
//				System.out.print(i+"\t");		// 
				
//				int i = fis.read();	//����Ʈ ������ �о� ����.
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
