package practice93;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}
}
