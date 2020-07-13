package day11;

import java.io.Serializable;

public class Friend implements Serializable {	// 객체를 직렬화 과정을 통해서 바이트 객체로 내보낼 수 있도록 함.
	private String name, birth, addr, tel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
