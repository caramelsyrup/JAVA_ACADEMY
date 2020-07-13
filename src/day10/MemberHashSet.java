package day10;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	
	private HashSet<Member> hashSet;	//  순서와 상관없이 중복을 허용하지 않을시 set사용 
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();	// HashSet 생성.
	}
	
	public void addMember(Member member) {
		hashSet.add(member);				// HashSet에 회원 추가                                                                                                                    
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = hashSet.iterator();	// iterator이용.
	
	
	while(ir.hasNext()) {
		Member member = ir.next();
		int tempId = member.getMemberID();
		if(tempId == memberID) {
			hashSet.remove(member);
			return true;
		}	
	}
	System.out.println(memberID+"가 존재하지 않습니다.");
	return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
