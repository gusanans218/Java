package practice0911;

public class Practice09 {
	public static void main(String[] args) {
		int[][]ggd = new int[8][9];
		for(int i =0; i<8; i++) {
			for(int j =0; j<9; j++) {
				ggd[i][j] = (i+2)*(j+1);
				System.out.print((i+2)+"*"+(j+1)+"="+ggd[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
