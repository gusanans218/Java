package practice0911;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int max, min;
		Scanner sc= new Scanner(System.in);
		System.out.println("5���� ������ �Է��Ͻÿ�");
		for (int i= 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		max = num[0];
		min = num[0];
		for(int i = 0; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min >num[i]) {
				min = num[i];
			}
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}

}
