package practice93;
	
	import java.util.Scanner;
	
public class Practice09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 : ");
		int number = sc.nextInt();
	  if(number > 0) {
		System.out.println("양수 입니다");
	}
		else if(number == 0) {
			System.out.println("0입니다");
		}
			else {
				System.out.println("음수 입니다");
		}
	}
}

