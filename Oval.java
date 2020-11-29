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
		System.out.println(w+"X"+h+"에 내접하는 타원입니다");

	}

	@Override
	public double getArea() {
		return w*h*PI;
	}

}
