package practice93;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("�簢���� ���θ� �Է� : ");
		w = input.nextInt();
		System.out.print("�簢���� ���θ� �Է� : ");
		h = input.nextInt();
		area = w * h;
		perimeter = 2.0 * (w + h);
		
		System.out.println("�簢���� ���̴� " + area);
		System.out.println("�簢���� �ѷ��� " + perimeter);
		
	}
}
