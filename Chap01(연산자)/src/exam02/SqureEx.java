package exam02;

import java.util.Scanner;

public class SqureEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.printf("�غ� �Է�: ");
		int num= sc.nextInt();//Ű����κ��� �������� �Է�
		System.out.printf("���� �Է�: ");
		int num1= sc.nextInt();
		System.out.print("��� :"+(double)(num*num1*(0.5)));

		
	}

}
