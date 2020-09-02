package exam02;

import java.util.Scanner;

//scanner 클래스 : 입력을 받기 위한 클래스이다.
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.printf("정수 입력: ");
		//int num=sc.nextInt();//키보드로부터 정수형을 입력
		
		
		//System.out.println("제곱값: "+num*num);

		System.out.println();
		System.out.println("문자열 입력 연습");
		//  String str; //변수 선언
		//  str=sc.next(); //초기값 입력 받기
		
		System.out.print("문자열 입력: ");
		String str=sc.nextLine();// 키보드로부터 문자열을 입력 받아서str변수에 넣어라
		System.out.println("입력 받은 문자열: " + str);
		
		sc.close();//스캐너 클래스(자원)종료
	}

}
