package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student{
	private String id;		// �л��� id	
	private String tel;		// �л��� ��ȣ
	private String name;	// �л��� �̸�
	
	public Student() {}		// ����Ʈ ������
	public Student (String id, String tel, String name) {
		this.id = id;
		this.tel = tel;
		this.name = name;
	}						// Student ������ ����.
/*	public String getName() {
		return name;
	}						// private ������ ����� �� �ֵ���.
	public String toString() {
		return "id :"+id+"/tel : "+tel+"/name : "+name;
	}						// toString�� ���ؼ� �������̵��� ����, �ּҰ��� ������ ���.
	
	public String getTel() {
		return tel;
*/
/*	public Student(String id, String tel, String name) {
	super();
	this.id = id;
	this.tel = tel;
	this.name = name;
*/	// source - constructor �ɼ��� �̿��ؼ��� ������ �ۼ�.
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	// source - getters and setters �ɼ��� �̿��ؼ� ���� �ۼ�.
	@Override
	public String toString() {
		return "Student [id=" + id + ", tel=" + tel + ", name=" + name + "]";
	}	// source- toString �ɼ��� �̿��ؼ� �ۼ�.
}

public class HashMapStudent {

	public static void main(String[] args) {
		// map ��ü ����. HashMap����.
		HashMap<String, Student> map = new HashMap<String, Student>();
		// hashmap�� �ڷḦ �ִ� �����  put�� ���� ���.
		// �� �ڷ��Է½�, Student�����ڸ� �Ź� ����Ѵ�. �����ڿ��� �������� ������ �� �ֵ��� ����.
		map.put("ȫ",new Student("1","010-1111-1111","ȫ�浿"));
		map.put("��",new Student("2","010-2222-1111","�̼���"));
		map.put("��",new Student("3","010-3333-1111","������"));
		
		// map�� �ִ� value���� ������ �޼ҵ带 �̿��� ��. �̰��� Student �� ��ü�� �ִ´�.
		Student st1 = map.get("ȫ");
		Student st2 = map.get("��");
		Student st3 = map.get("��");
		
		// ��¹� ����.
		System.out.println(st1.getName());
		System.out.println(st1);
		System.out.println(st1.getTel());
		
		// map�� ������ ���. - iterator�� �̿�.

		System.out.println("===for===");
		for(String value : map.keySet()) {
			System.out.println(map.get(value));
		}
		
		//map���·� ����� �������� iterator�� ���ؼ�
		System.out.println("===iterator===");
		// ũ�� map vs collection ���� ���
		// Map�������̽��� Ű,������ ������ ������ ����. Ű�� UNIQUE, �ߺ��� �ȵ�.
		// map�� TreeMap, HashMap, Hashtable �� ����ȭ.
		// collection�� �ٽ� List , Set ���� ����.
		// List �������̽� - ������ �ְ�, �ߺ� ���.
		// Set �������̽� - ������ ����, �ߺ� ������� ����. - map�� �Բ� ���.
		Set <String> set = map.keySet();	// map�� �ڷ���� set���� ��ȯ. ó�� ���°� map������ ������ ����. 
		
		// set�� ����� map�� Ű ���� �̿�, iterator�� ��ü it����.
		Iterator<String> it = set.iterator();
		// iterator�� �żҵ带 ���.
		// hasNext , Next,  remove ������ ȣ��ȴ�.
		while(it.hasNext()) {	// hasNext�� ��ü it�� ��ҵ��� �����ϸ� ��, �ƴϸ� ���� ��ȯ.
			// next�޼ҵ�� ��ü it�� ����� ���� ȣ��. ���� map�� Ű������ ������ ����.
			// ���ϵǴ� ���� map�� Ű���̱⿡, map�� �޼ҵ��� get�� ���� value�� ���� �� ����.
			System.out.println(map.get(it.next()));
								
		}
	
	}

}
