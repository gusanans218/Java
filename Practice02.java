package practice98;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		String x = sc.next();
		String y = " ";
		for(int i = 0; i< x.length(); i++)
		{
			y+=(char)(x.charAt(i)+1);
		}
		System.out.println(y);
	}
}
