package practice0911;

import java.util.Arrays;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]scores = new int[2][3]; int k = 0; for(int i = 0; i < scores.length; i++) { for(int j = 0; j < scores[i].length; j++) { scores[i][j] = k++; } System.out.println(Arrays.toString(scores[i])); }

	
	}

}
