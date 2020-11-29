package exam01;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		System.out.print("정수입력");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if((num % 4==0) && (num % 5==0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if((num % 4==0)||(num%5==0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if((num%4==0 ||num%5==0)&&!(num%4==0&&num%5==0))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
