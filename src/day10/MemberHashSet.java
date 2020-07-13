package day10;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	
	private HashSet<Member> hashSet;	//  ������ ������� �ߺ��� ������� ������ set��� 
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();	// HashSet ����.
	}
	
	public void addMember(Member member) {
		hashSet.add(member);				// HashSet�� ȸ�� �߰�                                                                                                                    
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = hashSet.iterator();	// iterator�̿�.
	
	
	while(ir.hasNext()) {
		Member member = ir.next();
		int tempId = member.getMemberID();
		if(tempId == memberID) {
			hashSet.remove(member);
			return true;
		}	
	}
	System.out.println(memberID+"�� �������� �ʽ��ϴ�.");
	return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
