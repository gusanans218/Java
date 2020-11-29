package sec03_test;

public class Circle implements Shape{
    int rad;
    public Circle(int rad) {
        this.rad = rad;
    }

    public static void main(String[] args) {
//        
//    	Shape dount = new Circle(10);
//        dount.redraw();
//        System.out.println("면적은" + dount.getArea());
    	Shape [] list = new Shape[3];
    	list[0] = new Circle(10);
    	list[1] = new Oval(20,30);
    	list[2] = new Rect(10,40);
    	
    	for(int i =0; i<list.length; i++)list[i].redraw();
    	for(int i =0; i<list.length; i++)System.out.println("면적은"+list[i].getArea());
    }

    @Override
    public void draw() {
        System.out.println("반지름은"+rad);
    }

    @Override
    public double getArea() {
        return rad*rad*PI;
    }

}