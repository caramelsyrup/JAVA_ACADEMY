package day09;

public class EncTest {
	
	String anw = "";
	
	public String encrypt(String msg) {
		 
		 for(int i=0; i<msg.length(); i++) {
			if(msg.charAt(i)==' ') {	// ' ' 로 표현. char 형으로 추출 했음.
				anw += (char)(msg.charAt(i));
			}else {
				anw += (char)(msg.charAt(i)+2);
			} // if else
		 } // for 	
			return anw;
		}// encrypt

/*	 public	String decrypt(String str1) {
	 		for(int i=0; i<str1.length(); i++) {
		 		if(str1.charAt(i)==' ') {	// ' ' 로 표현. char 형으로 추출 했음.
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
			if(msg.charAt(i)==' ') {	// ' ' 로 표현. char 형으로 추출 했음.
				anw += (char)(msg.charAt(i));
			}else {
				anw += (char)(msg.charAt(i)-2);
			} // if else
		 } // for 	
			return anw;
		}// encrypt
	 
	public static void main(String[] args) {
		EncTest enc = new EncTest();
		String msg = "Hi, Glad to meet you!";	// String 클래스의 msg에 문자열 저장.
		System.out.println("암호화 전 : "+msg);
		String str1 = enc.encrypt(msg);			// 한문자에 2씩 더하기
		System.out.println("암호화 후 : "+str1);
		System.out.println("복호화 후 : "+enc.decrypt(str1));
	}


}
