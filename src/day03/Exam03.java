package day03;

public class Exam03 {

	public static void main(String[] args) {
		// ���� �����͸� �� ���� ����.
		//������ ������ ������ �ʱ�
		
		int[] arr = new int[5]; 	// arr�̶�� �迭�� ����µ� 5���� �迭�� ����.
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		System.out.println(arr[2]);	// �迭 ��½� �迭 �̸��� �����Ͱ� �ִ� ���� �ּҸ� ���� �Է�.
		
		int[] test = new int[20];
		System.out.println(test[3]);	// 0�� ��� �Ǵµ�, �迭�� ������ �ʱⰪ�� 0�̴�.
		for(int i=0; i<test.length; i++) {	// test�� ���̸� 20���� �����ߴ�. �Ź� ���ڸ� �Է��ϴ°ͺ��ٴ� length�� Ȱ��.
			test[i]=i;
		}
		System.out.println(test[5]);
		System.out.println(test[3]);
		System.out.println("----------------------------------");
		int[] arr1=new int[5];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=i+1;
		}
		for(int i=0; i<arr1.length;i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		System.out.println("----------------------------------");
		int[] arr2= {1,2,3,4,5,6,7};	// �迭�� �����ϸ鼭, �ʱⰪ�� ��������.
		for(int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		System.out.println("----------------------------------");
		String[] str = {"one","two","three"};
		for(int i=0; i<str.length;i++) {
			System.out.println("str["+i+"] : "+str[i]);
		}
		
		
		
		
		
	}

}
