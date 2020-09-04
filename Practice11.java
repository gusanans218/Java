package practice94;

public class Practice11 {
	public static void main(String[] args) {
		int avg=0;
		int sum=0;
		int table[][]= {{ 4, 2 }, { 3, 6 }, { 1, 2 }, { 7, 3 }, { 4, 5 }};
		for(int x=table.length-1;x>-1;x--)
		{
			for(int y=0; y<2; y++)
			{
				avg += table[x][y];
				System.out.print((x+1)+"0" +(y+1)+"È£" +table[x][y]+"¸í");
			}
			System.out.println("          °¢ ÃþÀÇ Æò±Õ ÀÎ¿ø "+avg/2);
			sum = sum +avg;
			avg= 0;
			
		}
		System.out.println("ÀüÃ¼Æò±Õ" +sum/10);
	}
}
