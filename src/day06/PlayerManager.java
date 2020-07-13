package day06;
// 데이터 값들을 구체적으로 활용.
public class PlayerManager {
	private final int MAX_INT = 50;
	Player[] arr = new Player[MAX_INT];
	
	int cnt;
	
	void insertPlayer() {
		System.out.println("이름을 입력하세요.");
		String name = BookMain.sc.nextLine();
		System.out.println("주소를 입력하세요.");
		String address = BookMain.sc.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = BookMain.sc.nextInt();
		System.out.println("키 입력하세요.");
		double height = BookMain.sc.nextDouble();
		System.out.println("몸무게 입력하세요.");
		double weight = BookMain.sc.nextDouble();
		
		arr[cnt++] = new Player(name,address,age,height, weight);	// 배열에 자료를 넣음. 생성자를 이용.
		
	}

	void viewPlayer() {
		System.out.println("이름\t나이\t주소\t키\t몸무게");
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
		// 이때까지 리턴값 형태가 voild(리턴값없음), int, String 등의 메소드만 만듦. 하지만 Player형으로도 만들 수 있다. Player의 객체.
			for(int i=0; i<cnt; i++) {
				if(searchName.equals(arr[i].getName())) {
					return arr[i];
				}
			}
			return null;
	}	// 리턴값이 Player형인 객체도 가능하다. 

	
	void searchPlayer() {
		System.out.print("찾을 선수의 이름은?");
		String searchName = BookMain.sc.next();
	/*	for(Player data : arr) {
			if(data!=null) {
				if(data.getName().equals(searchName)) {	//문자열 비교는 equals를 이용한다.
					System.out.print(data.getName()+"\t");
					System.out.print(data.getAge()+"\t");
					System.out.print(data.getAddress()+"\t");
					System.out.print(data.getHeight()+"\t");
					System.out.println(data.getWeight()+"\t");
					break;
				}else{
					System.out.println("찾는 선수 없습니다.");
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
				 * 	System.out.println("찾는 선수 없습니다.");
				 * }
				 
			}else
				break;
		}
    */
		
		Player p = search(searchName);
		// Player형인 객체도 리턴값이 가능하기에, 메소드를 만든다.
		if(p==null) {
			System.out.println("찾는 선수 없습니다.");
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
