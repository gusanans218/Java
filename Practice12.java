package practice94;

public class Practice12 {
	public static void main(String[] args) {
		int a= 100;
		int b= 100;
		int c= 50;
		
		if(a==b)
		{
			System.out.println("a는 b와 같다");
		}
		
		if(a==c)
		{
			System.out.println("a와 c는 같다");
		}
		else
		{
			System.out.println("a와 c는 다르다");
		}
		
		if(a==c)
		{
			System.out.println("a와 c는 같다");
		}
		else if (a==(2*c))
		{
			System.out.println("a는 c에 2를 곱한 값과 같다");
		}
		else 
		{
			System.out.println("a는 c는 다르다");
		}
	}
}
