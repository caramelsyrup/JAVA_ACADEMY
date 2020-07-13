package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{	// ����ȭ�� ����ϰ� �ȴٸ�, ���� Ŭ������ Serializable
	private static final long serialVersionUID	=	-1503252402544036183L;
	String name;
	transient String job;	// �ش� ������ �����ؼ� ����� ���� ����.
	
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
		Person personAhn	=	new Person("�����","��ǥ�̻�");
		Person personKim	=	new Person("��ö��","���̻�");
		
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