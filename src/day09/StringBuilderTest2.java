package day09;

public class StringBuilderTest2 {
	
	private StringBuilder encrypt(String msg) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<msg.length(); i++) {
			if(msg.charAt(i)==' ') {
				sb.append((char)msg.charAt(i));	
			}else {
				sb.append((char)(msg.charAt(i)+2));
			}
		}
		return sb;
	}
	
	private StringBuilder decrypt(String str1) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)==' ') {
				sb.append((char)str1.charAt(i));	
			}else {
				sb.append((char)(str1.charAt(i)-2));
			}
		}
		return sb;
	}
	
	public static void main(String[] args) {
		StringBuilderTest2 eb = new StringBuilderTest2();
		String msg = "Hi.. Glad to meet you!!";
		System.out.println("암호화 전 :"+msg);
		String str1 = eb.encrypt(msg).toString(); // 한문자에 2씩더하기
		System.out.println("암호화 후 :"+str1);
		System.out.println("암호화 후 :"+eb.decrypt(str1).toString());
		
		
		
	}

}
