package practice0911;

public class Practice07 {

	public static void main(String[] args) {
		int[][] num = { {4, 3, 4}, // 0행
				{3, 7, 6}, // 1행
			    {5, 8, 7}, // 2행
				{9, 9, 10}}; // 3행
              // 0열 1열 2열
		for(int i =0; i<4; i++) {
			for(int j = 0; j<3; j++)
				System.out.println(i+"행 "+j+"열의 값"+num[i][j]);
		}
	}

}
