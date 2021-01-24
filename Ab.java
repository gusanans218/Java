package coding1010;
	import java.util.Scanner;
public class Ab {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = 1;
		for(int i =1; i<b; i++) {
			n *=10;
		}
		int tmp = a/(n);
		System.out.println(tmp);
		System.out.printf("%d¿¡¼­ °ª%d",a,tmp%10);
	}
}
