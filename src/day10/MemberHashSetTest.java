package day10;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001,"������");
		Member memberson = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberson);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberhong = new Member(1003, "ȫ�浿");
		memberHashSet.addMember(memberhong);
		memberHashSet.showAllMember();
	}

}
