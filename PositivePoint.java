package sec03_test;

class Point{
    int i = 0, j =0;
    int x,y;

    public Point() {

    }
    public Point(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String toString() {
        return"("+ x +","+y+")의 합";
    }

    void move(int i, int j) {
        if(i>0&&j>0) {
            x = i;
            y=j;
        }
    }
}

public class PositivePoint extends Point{
    public PositivePoint(int i,int j) {
        super(i,j);
        move(i,j);
    }
    public PositivePoint() {
    }
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString()+"입니다");
        
        p.move(-5, 5);
        System.out.println(p.toString()+"입니다");
        
       PositivePoint p2 = new PositivePoint(-10,-10);
       System.out.println(p2.toString()+"입니다");
    }
}