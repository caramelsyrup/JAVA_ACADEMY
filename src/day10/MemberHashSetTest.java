package day10;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberson = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서원");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberson);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberhong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberhong);
		memberHashSet.showAllMember();
	}

}
