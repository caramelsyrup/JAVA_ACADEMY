package day11;

import java.io.Serializable;

public class Friend implements Serializable {	// ��ü�� ����ȭ ������ ���ؼ� ����Ʈ ��ü�� ������ �� �ֵ��� ��.
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
