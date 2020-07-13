package practice;

public class Question5 {

	public static void main(String[] args) {
		
		for(int j=0; j<7; j++) {		//¼¼·Î 7Ä­
		  for(int i=0; i<7; i++) {	// °¡·Î 7Ä­
			 if(i<=7/2){				// »ó´Ü.
				if(j+i<(7/2)) {			// ¿ÞÂÊ »ó´Ü ºóÄ­ ÀÔ·Â.
					System.out.print(" ");
				}else if(j-i>=(7/2)+1) {		// ¿ÞÂÊ ÇÏ´Ü ºóÄ­ ÀÔ·Â.
					System.out.print(" ");
				}else {
					System.out.print("*");	// 4¹ø¤Š¿¡¼­ Á¡ ´ÙÂï±â.
				}
			 }else if (i>(7/2)){			// ÇÏ´Ü.
				 if(i-j>=(7/2)+1) {		// ¿À¸¥ÂÊ »ó´Ü ºóÄ­
					 System.out.print(" ");
				 }else if(i+j>=10) {		// ¿À¸¥ÂÊ ÇÏ´Ü ºóÄ­ ÀÔ·Â.
					 System.out.print(" ");
				 }else {
					 System.out.print("*");
				 }
				
			}
		  }
		  System.out.println();
		}
	}
}
