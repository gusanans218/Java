package practice94;

public class Practice13 {
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		switch (a+b)
		{
		case 30:
			System.out.println("a와 b의 합은 30이다");
			break;
		case 10:
		System.out.println("a는 10이다");
		break;
		case 20:
			System.out.println("b는 20이다");
			break;
			default:
				System.out.println("만족한 답은 없습니다");
		}
		System.out.println();
	}
}
