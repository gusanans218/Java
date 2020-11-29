package exam01;

public class Water {
	double liter;
	String brand;
	int price;

	public Water(double liter, String brand, int price) {
		this.liter = liter;
		this.brand = brand;
		this.price = price;
	}

	public Water() {
		// TODO Auto-generated constructor stub
	}
	public Water(double liter, String brand) {
		this(liter,brand,700);
	}
	void print() {
		System.out.println("물의 리터" + liter + "물의 브랜드" + brand + "물의  가격" + price);
	}
}