package day05_object;

public class DrinkTeaMain {

	public static void main(String[] args) {
		Drink[] arr = new Drink[100];	// arr�� Drink Ŭ������ �־� ����.
		// Ŀ�� 500 3 1500
		// ���� 800 5 4000
		// ī��� 1500 5 7500
		
		//���Ǹž�
		
		arr[0] = new Drink("Ŀ��",500,3);
		arr[1] = new Drink("����",800,5);
		arr[2] = new Drink("ī���",1500,5);
		// �迭�� Drink Ŭ���� ��ü�� �ִ� ���� ����.
		// Drink d1 = new Drink("Ŀ��",500,3); , arr[0] = d1; �� ������ ���.
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				arr[i].getData();
				sum += arr[i].getTotal();
			}
			// if(arr[i]==null) break; �� �ص� �ȴ�. ���� ���� ��.
			
		}
		System.out.println(sum);
	}
		
		

}
