package exam01;

import java.util.Scanner;

public class ScannerEx04 {
	public static void main(String[] args) {
		System.out.print("È­¾¾¿Âµµ´Â? ");
		Scanner sc = new Scanner(System.in);
		double f = sc.nextInt();
		
		double i= (5.0/9)*(f-32);
		System.out.println(i);
		
		
	}
}
