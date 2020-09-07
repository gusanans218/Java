package practice97;

import java.util.Random;
import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		
		int coin = 0;
		while(true)
		{
		System.out.println("===============");
		System.out.println("노래방 프로그램");
		System.out.println("현재 코인"+coin);
		System.out.println("1) 코인 충전\n2)노래재생\n3)끝내기");
		System.out.println("=============\n>>>");
		
		int choice = sc.nextInt();
		
		if (choice==1) {
			System.out.println("코인충전");
			System.out.print("충전금액을 입력: ");
			int money = sc.nextInt();
			coin+=money/500;
			System.out.println("\n\n***********************");
			System.out.println(money/500+"개 코인이 충전되었습니다");
			System.out.println("환급금액은 "+money%500+"입니다");
			System.out.println("**********************\n\n");
			}
		
		else if(choice ==2) {
			if(coin>0) {
				System.out.print("곡 제목을 입력해주세요: ");
				
				String song = sc.next();
				System.out.println(song+" 재생합니다");
				coin--;
				System.out.println("노래 재생중");
				
				for(int i = 0; i<3; i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
					}
				System.out.println("\n\n");
				
				int score = r.nextInt(101);
				System.out.println("점수: "+score);
				
				if(score<=30) {System.out.println("노래 실력이 최악이네요!!");}
				else if(score<60) {System.out.println("그저 그런 실력이시네요!!");}
				else if(score<90) {System.out.println("잘 부르시는데요!!");}
				else {System.out.println("가수해도 되겠어요!!");}
				System.out.println("\n\n");
			}
			else if(coin<1) {
				System.out.println("코인이 부족합니다. 코인충전 후 이용하세요\n");
			}
			else {
				System.out.println("노래방 프로그램을 종료합니다");
				break;
			}
		}
		}
	}
}
