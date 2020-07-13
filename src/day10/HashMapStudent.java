package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student{
	private String id;		// 학생의 id	
	private String tel;		// 학생의 번호
	private String name;	// 학생의 이름
	
	public Student() {}		// 디폴트 생성자
	public Student (String id, String tel, String name) {
		this.id = id;
		this.tel = tel;
		this.name = name;
	}						// Student 생성자 설정.
/*	public String getName() {
		return name;
	}						// private 변수를 사용할 수 있도록.
	public String toString() {
		return "id :"+id+"/tel : "+tel+"/name : "+name;
	}						// toString을 통해서 오버라이딩을 통한, 주소값의 데이터 출력.
	
	public String getTel() {
		return tel;
*/
/*	public Student(String id, String tel, String name) {
	super();
	this.id = id;
	this.tel = tel;
	this.name = name;
*/	// source - constructor 옵션을 이용해서도 간단히 작성.
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
	}	// source - getters and setters 옵션을 이용해서 문장 작성.
	@Override
	public String toString() {
		return "Student [id=" + id + ", tel=" + tel + ", name=" + name + "]";
	}	// source- toString 옵션을 이용해서 작성.
}

public class HashMapStudent {

	public static void main(String[] args) {
		// map 객체 만듦. HashMap형태.
		HashMap<String, Student> map = new HashMap<String, Student>();
		// hashmap에 자료를 넣는 방법은  put을 쓰는 방법.
		// 각 자료입력시, Student생성자를 매번 사용한다. 생성자에서 각변수로 저장할 수 있도록 설정.
		map.put("홍",new Student("1","010-1111-1111","홍길동"));
		map.put("이",new Student("2","010-2222-1111","이순신"));
		map.put("강",new Student("3","010-3333-1111","강감찬"));
		
		// map에 있는 value값은 생성자 메소드를 이용한 것. 이것을 Student 각 객체에 넣는다.
		Student st1 = map.get("홍");
		Student st2 = map.get("이");
		Student st3 = map.get("강");
		
		// 출력문 실행.
		System.out.println(st1.getName());
		System.out.println(st1);
		System.out.println(st1.getTel());
		
		// map의 정보를 출력. - iterator를 이용.

		System.out.println("===for===");
		for(String value : map.keySet()) {
			System.out.println(map.get(value));
		}
		
		//map형태로 저장된 정보들을 iterator를 통해서
		System.out.println("===iterator===");
		// 크게 map vs collection 으로 양분
		// Map인터페이스는 키,벨류의 쌍으로 데이터 저장. 키는 UNIQUE, 중복이 안됨.
		// map은 TreeMap, HashMap, Hashtable 로 세분화.
		// collection은 다시 List , Set 으로 나뉨.
		// List 인터페이스 - 순서가 있고, 중복 허용.
		// Set 인터페이스 - 순서가 없고, 중복 허용하지 않음. - map과 함께 사용.
		Set <String> set = map.keySet();	// map의 자료들을 set으로 전환. 처음 형태가 map형으로 순서가 없다. 
		
		// set에 저장된 map의 키 값을 이용, iterator의 객체 it생성.
		Iterator<String> it = set.iterator();
		// iterator의 매소드를 사용.
		// hasNext , Next,  remove 순서로 호출된다.
		while(it.hasNext()) {	// hasNext는 객체 it에 요소들이 존재하면 참, 아니면 거짓 반환.
			// next메소드는 객체 it에 저장된 값을 호출. 현재 map의 키값들을 가지고 있음.
			// 리턴되는 값은 map의 키값이기에, map의 메소드인 get을 쓰면 value를 얻을 수 있음.
			System.out.println(map.get(it.next()));
								
		}
	
	}

}
