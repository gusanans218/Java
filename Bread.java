package exam01;

public class Bread {
	String souce;
	double price;
	String box;
	
	void show() {
		System.out.print("소스는 : "+ souce+" 가격은: "+price+" 모양은 : "+box);
	}
	
	public static void main(String[] args) {
		Bread b1 = new Bread();
		b1.souce = "머스타드";
		b1.price = 5500;
		b1.box = "반원";
		b1.show();
	}
}
