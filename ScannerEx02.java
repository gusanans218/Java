package exam01;

import java.util.Scanner;

public class ScannerEx02 {
	public static void main(String[] args) {
		System.out.print("������� �ظ� ��������? ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		System.out.print("������� ���̴�? ");
		int h = sc.nextInt();
		
	
		
		System.out.print("������� ���Ǵ� "+ (b*b*h*3.14));
		
	}
}
