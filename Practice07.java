package practice0911;

public class Practice07 {

	public static void main(String[] args) {
		int[][] num = { {4, 3, 4}, // 0��
				{3, 7, 6}, // 1��
			    {5, 8, 7}, // 2��
				{9, 9, 10}}; // 3��
              // 0�� 1�� 2��
		for(int i =0; i<4; i++) {
			for(int j = 0; j<3; j++)
				System.out.println(i+"�� "+j+"���� ��"+num[i][j]);
		}
	}

}
