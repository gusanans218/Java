package exam02;

import java.util.Scanner;

public class SqureEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.printf("밑변 입력: ");
		int num= sc.nextInt();//키보드로부터 정수형을 입력
		System.out.printf("높이 입력: ");
		int num1= sc.nextInt();
		System.out.print("결과 :"+(double)(num*num1*(0.5)));

		
	}

}
