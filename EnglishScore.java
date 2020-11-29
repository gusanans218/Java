package sec04;

public class EnglishScore {
	String name;
	int score;

class EnglishScore implements Comparable<EnglishScore>{
	
}
	
public EnglishScore(String name, int score) {
	this.name = name;
	this.score = score;
	
}
public String toString() {
	return name +","+score;
}
public int compareTo(EnglishScore o) {
	return score = o.score;
}

public class ScoreTest{
	EnglishScore findBest(EnglishScore[] a) {
		EnglishScore best = a[0];
		
		for(int i =1; i<a.length; i++) {
			if(best.score<a[i].score)
				best = a[i];
		}
		return best;
	}
		
	public void main(String[] args) {
		
	}
	
}
}

