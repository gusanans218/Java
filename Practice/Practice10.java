package practice93;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �ּ���");
		System.out.println("1. ����  2. ����  3. ����  4. ����");
		System.out.println("�����ȣ : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("101ȣ �Դϴ�"); break;
		case 2 : System.out.println("102ȣ �Դϴ�"); break;
		case 3 : System.out.println("103ȣ �Դϴ�"); break;
		case 4 : System.out.println("104ȣ �Դϴ�"); break;
		default : System.out.println("�������� �������ּ���"); break;
		
		}
		sc.close();
	}
}
