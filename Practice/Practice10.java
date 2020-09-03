package practice93;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택해 주세요");
		System.out.println("1. 수학  2. 과학  3. 영어  4. 역사");
		System.out.println("과목번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("101호 입니다"); break;
		case 2 : System.out.println("102호 입니다"); break;
		case 3 : System.out.println("103호 입니다"); break;
		case 4 : System.out.println("104호 입니다"); break;
		default : System.out.println("상담원에게 문의해주세요"); break;
		
		}
		sc.close();
	}
}
