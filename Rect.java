package sec03_test;

public class Rect implements Shape {
	int a;
	int b;
	public Rect(int a, int b) {
		this.a = a;
		this.b = b;

	}

	@Override
	public void draw() {
		System.out.println(a+"X"+b+"ũ���� �簢���Դϴ�");

	}

	@Override
	public double getArea() {
		return a*b;
	}

}
