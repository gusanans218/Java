package practice0911;

public class Practice04 {
	public static void main(String[] args) {
		int[]score = {93,75,95,76,70};
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
	}
		double avg = (double) sum /score.length;
		System.out.println("점수 합계 : "+sum);
		System.out.println("점수 평균 : "+avg);
	}
}
