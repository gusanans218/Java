package practice93;
	
	import java.util.Scanner;
	
public class Practice09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է� : ");
		int number = sc.nextInt();
	  if(number > 0) {
		System.out.println("��� �Դϴ�");
	}
		else if(number == 0) {
			System.out.println("0�Դϴ�");
		}
			else {
				System.out.println("���� �Դϴ�");
		}
	}
}

