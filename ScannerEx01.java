package exam01;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num+"�� ������: " + (num*num));
	}
}
