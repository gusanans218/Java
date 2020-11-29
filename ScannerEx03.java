package exam01;

import java.util.Scanner;

public class ScannerEx03 {
	public static void main(String[] args) {
		   int hour, min, sec;
	        Scanner s = new Scanner(System.in); 
	        System.out.print("초 단위 정수를 입력하세요 "); 
	        sec = s.nextInt(); 
	        min = sec / 60; 
	        hour = min / 60; 
	        sec = sec % 60; 
	        min = min % 60; 
	        System.out.printf("%d시 %d분 %d초", hour, min, sec);



	    }
	}