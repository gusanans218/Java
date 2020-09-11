package practice0911;
	
import java.util.Arrays;

public class Practice02 {
	public static void main(String[] args) {
		int[][]scores = new int[2][3];
		int k = 0;
		for(int i =0; i<scores.length; i++) {
			for(int j =0; j<scores.length; i++) {
				scores[i][j] = k++;
			}
			System.out.println(Arrays.toString(scores[i]));
		}
	}
}
