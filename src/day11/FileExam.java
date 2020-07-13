package day11;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+" : "+f1.getParent()+" : "+f1.getName());
		// ���, �θ�(����), ���ϸ�. ���
		String res =" ";
		if(f1.isFile()) {
			res="file";
		}else if(f1.isDirectory()) {
			res= "���丮";
		}
		System.out.println(f1.getPath()+" �� "+ res+" �Դϴ�.");
		
		File f2 = new File("folder");
		if(f2.isFile()) {
			res="����";
		}else if(f2.isDirectory()) {
			res= "���丮";
		}
		System.out.println(f2.getPath()+" �� "+ res+" �Դϴ�.");
		if(!f2.exists()) {
			System.out.println("���Ͼ���.");
		}
		System.out.println("=--���긮��Ʈ--=");
		File[] subFiles	=	f2.listFiles();	// �����ȿ� �ִ� ���ϵ��� �迭���·� �����ַ���.
		for(int i=0; i<subFiles.length;i++) {
			File f = subFiles[i];		// object������ ����.
			long t = f.lastModified();	// �������� ������ ��¥�� long������ �˷���.
			System.out.println(f.getName());	// ���� ��
			System.out.println("����ũ�� : "+f.length());	// ������ ũ��
			System.out.printf("�����ð� : %ty�� %tb %td %ta %tT\n",t,t,t,t,t);	// ��,��,����,��,��,��. printf�� t�� %t�� ����.
			
		}
		
	}

}
