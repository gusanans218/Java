package practice97;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("������ ��� ���α׷�");
		System.out.println("���Ͻô� �ܼ��� �Է�\n>>");
		 
		int x = sc.nextInt();
		System.out.println(x+"��");
		for(int i = 1; i<=9; i++) {
			System.out.println(x+"x"+i+"="+x*i);
		}
	}
}
