package practice97;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("구구단 출력 프로그램");
		System.out.println("원하시는 단수를 입력\n>>");
		 
		int x = sc.nextInt();
		System.out.println(x+"단");
		for(int i = 1; i<=9; i++) {
			System.out.println(x+"x"+i+"="+x*i);
		}
	}
}
