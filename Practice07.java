package practice94;

public class Practice07 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<101; i++)
		{
			i=i+1;
			sum = i+ sum;
		}
		System.out.println("2���� 100������ ¦���� �� = " +sum);
	}
}
