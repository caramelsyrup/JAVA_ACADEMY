package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{	// 직렬화를 사용하게 된다면, 관련 클래스에 Serializable
	private static final long serialVersionUID	=	-1503252402544036183L;
	String name;
	transient String job;	// 해당 변수는 접근해서 출력이 되질 않음.
	
	public Person() {}
	public Person (String name, String job ) {
		this.name = name;
		this.job	=	job;
	}
	
	public String toString() {
		return name+" , "+job;
	}
}

public class SerializationTest {
	
	public static void main(String[] args) {
		Person personAhn	=	new Person("안재용","대표이사");
		Person personKim	=	new Person("김철수","상무이사");
		
		try
		(FileOutputStream fos = new FileOutputStream("serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
