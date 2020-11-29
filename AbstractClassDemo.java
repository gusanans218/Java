package sec01_abstract;

abstract class Shape{
	double pi = 3.14;
	//�߻�޼���
	abstract void draw();
	public double findArea() {
		return 0.0;
	}
}
class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	void draw() {
		System.out.println("���� �׸���");
	}
	public double findArea() {
		return pi*radius*radius;
	}
	
}

class Rectangle extends Shape{
    int width,height;

    @Override
    void draw() {
        System.out.println("�簢���� �׸���");
    }

    public Rectangle(int width, int height) {
        this.height = height;
        this.width=width;
    }
    public double findArea() {
        return width*height;
    }
}

public class AbstractClassDemo {
	public static void main(String[] args) {
//		Shape s= new Shape();
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���� : %.1f", c.findArea());
		System.out.println();
		Rectangle r = new Rectangle(3,4);
        r.draw();
        System.out.printf("�簢���� ����:%.1f",r.findArea());
    

	}
}
