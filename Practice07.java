package practice97;

import java.util.Random;
import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		
		int coin = 0;
		while(true)
		{
		System.out.println("===============");
		System.out.println("�뷡�� ���α׷�");
		System.out.println("���� ����"+coin);
		System.out.println("1) ���� ����\n2)�뷡���\n3)������");
		System.out.println("=============\n>>>");
		
		int choice = sc.nextInt();
		
		if (choice==1) {
			System.out.println("��������");
			System.out.print("�����ݾ��� �Է�: ");
			int money = sc.nextInt();
			coin+=money/500;
			System.out.println("\n\n***********************");
			System.out.println(money/500+"�� ������ �����Ǿ����ϴ�");
			System.out.println("ȯ�ޱݾ��� "+money%500+"�Դϴ�");
			System.out.println("**********************\n\n");
			}
		
		else if(choice ==2) {
			if(coin>0) {
				System.out.print("�� ������ �Է����ּ���: ");
				
				String song = sc.next();
				System.out.println(song+" ����մϴ�");
				coin--;
				System.out.println("�뷡 �����");
				
				for(int i = 0; i<3; i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
					}
				System.out.println("\n\n");
				
				int score = r.nextInt(101);
				System.out.println("����: "+score);
				
				if(score<=30) {System.out.println("�뷡 �Ƿ��� �־��̳׿�!!");}
				else if(score<60) {System.out.println("���� �׷� �Ƿ��̽ó׿�!!");}
				else if(score<90) {System.out.println("�� �θ��ôµ���!!");}
				else {System.out.println("�����ص� �ǰھ��!!");}
				System.out.println("\n\n");
			}
			else if(coin<1) {
				System.out.println("������ �����մϴ�. �������� �� �̿��ϼ���\n");
			}
			else {
				System.out.println("�뷡�� ���α׷��� �����մϴ�");
				break;
			}
		}
		}
	}
}
