package practice0911;

public class Practice06 {

	public static void main(String[] args) {
		int[] score = {78,70,65,98,58};
		int sum =0;
		for(int i : score) {
			sum += i;
		}
		System.out.println("점수 합계 : "+sum);

	}

}
