package practice94;

public class Practice12 {
	public static void main(String[] args) {
		int a= 100;
		int b= 100;
		int c= 50;
		
		if(a==b)
		{
			System.out.println("a�� b�� ����");
		}
		
		if(a==c)
		{
			System.out.println("a�� c�� ����");
		}
		else
		{
			System.out.println("a�� c�� �ٸ���");
		}
		
		if(a==c)
		{
			System.out.println("a�� c�� ����");
		}
		else if (a==(2*c))
		{
			System.out.println("a�� c�� 2�� ���� ���� ����");
		}
		else 
		{
			System.out.println("a�� c�� �ٸ���");
		}
	}
}
