package practice0919;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
//		System.out.println("82 + 17 = " +(82+17));
		
//		int x; 
//		int y;
//		x = 63;
//		y = 18;
//		System.out.println("x값은 " +x+"입니다");
//		System.out.println("y값은 " +y+"입니다");
//		System.out.println("합계는 " +(x+y)+"입니다");
//		System.out.println("평균은 " +(x+y)/2+"입니다");
//		Scanner stdIn = new Scanner(System.in);
//		System.out.print("정수값");
//		int x = stdIn.nextInt();
//		System.out.println(x +"를 입력했습니다");
		
		
//		Scanner stdIn = new Scanner(System.in);
//		System.out.print("정수값");
//		int x = stdIn.nextInt();
//		System.out.println("10을 더한 값은 " + (x+10)+"입니다");
//		System.out.println("10을 뺀 값은 " + (x-10)+"입니다");
		
//		Scanner stdIn = new Scanner (System.in);
//		System.out.print("x 값");
//		double x = stdIn.nextDouble();
//		System.out.print("y 값");
//		double y = stdIn.nextDouble();
//		System.out.println("합계는"+ (x+y)+"입니다");
//		System.out.println("평균는"+ (x+y)/2+"입니다");
		
		Scanner stdIn = new Scanner (System.in);
		final double PI = 3.1416;
		System.out.println("구의 겉넓이와 부피를 구한다");
		System.out.println("반지름");
		double r = stdIn.nextDouble();
		System.out.println("겉넓이는"+ (4 *PI *r * r)+ "입니다");
		System.out.println("부피는"+ (4/3.0 *PI *r * r * r)+ "입니다");
		
	}
}
