package exam01;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num+"의 제곱은: " + (num*num));
	}
}
