package sec03_test;

public class Oval implements Shape {
	int w;
	int h;
	public Oval(int w , int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public void draw() {
		System.out.println(w+"X"+h+"�� �����ϴ� Ÿ���Դϴ�");

	}

	@Override
	public double getArea() {
		return w*h*PI;
	}

}
