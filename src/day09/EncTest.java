package day09;

public class EncTest {
	
	String anw = "";
	
	public String encrypt(String msg) {
		 
		 for(int i=0; i<msg.length(); i++) {
			if(msg.charAt(i)==' ') {	// ' ' �� ǥ��. char ������ ���� ����.
				anw += (char)(msg.charAt(i));
			}else {
				anw += (char)(msg.charAt(i)+2);
			} // if else
		 } // for 	
			return anw;
		}// encrypt

/*	 public	String decrypt(String str1) {
	 		for(int i=0; i<str1.length(); i++) {
		 		if(str1.charAt(i)==' ') {	// ' ' �� ǥ��. char ������ ���� ����.
					anw += (char)(str1.charAt(i));
				}else {
					anw += (char)(str1.charAt(i)-2);
				} // if else
			 } // for 		
	 	
	 		return anw;
	 	}
*/	 	
	 public String decrypt(String msg) {
		 
		 for(int i=0; i<msg.length(); i++) {
			if(msg.charAt(i)==' ') {	// ' ' �� ǥ��. char ������ ���� ����.
				anw += (char)(msg.charAt(i));
			}else {
				anw += (char)(msg.charAt(i)-2);
			} // if else
		 } // for 	
			return anw;
		}// encrypt
	 
	public static void main(String[] args) {
		EncTest enc = new EncTest();
		String msg = "Hi, Glad to meet you!";	// String Ŭ������ msg�� ���ڿ� ����.
		System.out.println("��ȣȭ �� : "+msg);
		String str1 = enc.encrypt(msg);			// �ѹ��ڿ� 2�� ���ϱ�
		System.out.println("��ȣȭ �� : "+str1);
		System.out.println("��ȣȭ �� : "+enc.decrypt(str1));
	}


}
