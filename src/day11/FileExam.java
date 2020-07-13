package day11;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+" : "+f1.getParent()+" : "+f1.getName());
		// 경로, 부모(상위), 파일명. 출력
		String res =" ";
		if(f1.isFile()) {
			res="file";
		}else if(f1.isDirectory()) {
			res= "디렉토리";
		}
		System.out.println(f1.getPath()+" 는 "+ res+" 입니다.");
		
		File f2 = new File("folder");
		if(f2.isFile()) {
			res="파일";
		}else if(f2.isDirectory()) {
			res= "디렉토리";
		}
		System.out.println(f2.getPath()+" 는 "+ res+" 입니다.");
		if(!f2.exists()) {
			System.out.println("파일없음.");
		}
		System.out.println("=--서브리스트--=");
		File[] subFiles	=	f2.listFiles();	// 폴더안에 있는 파일들을 배열형태로 보여주려고.
		for(int i=0; i<subFiles.length;i++) {
			File f = subFiles[i];		// object형으로 보냄.
			long t = f.lastModified();	// 마지막에 수정한 날짜를 long형으로 알려줌.
			System.out.println(f.getName());	// 파일 명
			System.out.println("파일크기 : "+f.length());	// 파일의 크기
			System.out.printf("수정시간 : %ty년 %tb %td %ta %tT\n",t,t,t,t,t);	// 월,일,요일,시,분,초. printf로 t를 %t에 대입.
			
		}
		
	}

}
