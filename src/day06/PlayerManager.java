package day06;
// ������ ������ ��ü������ Ȱ��.
public class PlayerManager {
	private final int MAX_INT = 50;
	Player[] arr = new Player[MAX_INT];
	
	int cnt;
	
	void insertPlayer() {
		System.out.println("�̸��� �Է��ϼ���.");
		String name = BookMain.sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���.");
		String address = BookMain.sc.nextLine();
		System.out.println("���̸� �Է��ϼ���.");
		int age = BookMain.sc.nextInt();
		System.out.println("Ű �Է��ϼ���.");
		double height = BookMain.sc.nextDouble();
		System.out.println("������ �Է��ϼ���.");
		double weight = BookMain.sc.nextDouble();
		
		arr[cnt++] = new Player(name,address,age,height, weight);	// �迭�� �ڷḦ ����. �����ڸ� �̿�.
		
	}

	void viewPlayer() {
		System.out.println("�̸�\t����\t�ּ�\tŰ\t������");
		for(Player data : arr) {
			if(data!=null) {
				System.out.print(data.getName()+"\t");
				System.out.print(data.getAge()+"\t");
				System.out.print(data.getAddress()+"\t");
				System.out.print(data.getHeight()+"\t");
				System.out.println(data.getWeight()+"\t");
			}else 
				break;
			
		}
		
	}
	
	public Player search (String searchName) {	
		// �̶����� ���ϰ� ���°� voild(���ϰ�����), int, String ���� �޼ҵ常 ����. ������ Player�����ε� ���� �� �ִ�. Player�� ��ü.
			for(int i=0; i<cnt; i++) {
				if(searchName.equals(arr[i].getName())) {
					return arr[i];
				}
			}
			return null;
	}	// ���ϰ��� Player���� ��ü�� �����ϴ�. 

	
	void searchPlayer() {
		System.out.print("ã�� ������ �̸���?");
		String searchName = BookMain.sc.next();
	/*	for(Player data : arr) {
			if(data!=null) {
				if(data.getName().equals(searchName)) {	//���ڿ� �񱳴� equals�� �̿��Ѵ�.
					System.out.print(data.getName()+"\t");
					System.out.print(data.getAge()+"\t");
					System.out.print(data.getAddress()+"\t");
					System.out.print(data.getHeight()+"\t");
					System.out.println(data.getWeight()+"\t");
					break;
				}else{
					System.out.println("ã�� ���� �����ϴ�.");
					break;
				}
				 Player p =null;
				 * for(int i=0; i<cnt;i++){
				 * 	if(searchName.equals(arr[i].getName()){
				 * 	p = arr[i];
				 * 	break;}
				 * }
				 * if(p!=null){
				 * 	System.out.print(data.getName()+"\t");
					System.out.print(data.getAge()+"\t");
					System.out.print(data.getAddress()+"\t");
					System.out.print(data.getHeight()+"\t");
					System.out.println(data.getWeight()+"\t");
				 * }else{
				 * 	System.out.println("ã�� ���� �����ϴ�.");
				 * }
				 
			}else
				break;
		}
    */
		
		Player p = search(searchName);
		// Player���� ��ü�� ���ϰ��� �����ϱ⿡, �޼ҵ带 �����.
		if(p==null) {
			System.out.println("ã�� ���� �����ϴ�.");
			return;
		}else {
			System.out.print(p.getName()+"\t");
			System.out.print(p.getAge()+"\t");
			System.out.print(p.getAddress()+"\t");
			System.out.print(p.getHeight()+"\t");
			System.out.println(p.getWeight()+"\t");
		}
	}

	
	
}
