package exam01;

import java.util.Scanner;

public class ScannerEx02 {
	public static void main(String[] args) {
		System.out.print("원기둥의 밑면 반지름은? ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		System.out.print("원기둥의 높이는? ");
		int h = sc.nextInt();
		
	
		
		System.out.print("원기둥의 부피는 "+ (b*b*h*3.14));
		
	}
}
