package exam02;

import java.util.Scanner;

//scanner Ŭ���� : �Է��� �ޱ� ���� Ŭ�����̴�.
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.printf("���� �Է�: ");
		//int num=sc.nextInt();//Ű����κ��� �������� �Է�
		
		
		//System.out.println("������: "+num*num);

		System.out.println();
		System.out.println("���ڿ� �Է� ����");
		//  String str; //���� ����
		//  str=sc.next(); //�ʱⰪ �Է� �ޱ�
		
		System.out.print("���ڿ� �Է�: ");
		String str=sc.nextLine();// Ű����κ��� ���ڿ��� �Է� �޾Ƽ�str������ �־��
		System.out.println("�Է� ���� ���ڿ�: " + str);
		
		sc.close();//��ĳ�� Ŭ����(�ڿ�)����
	}

}
