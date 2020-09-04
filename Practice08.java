package practice94;

public class Practice08 {
	public static void main(String[] args) {
		int sum = 0; 
		for(int x = 2; x<10; x++)
		{
			for(int y=1; y<10; y++)
			{
				sum = x*y;
				System.out.print(x+ "*" +y+ "=" +sum+ "\t");
			}
			System.out.println();
		}
	}
}
