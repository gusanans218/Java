package exam02;

class Car{
    String color;
    static int numofcar;
    static int numofyellowcar;

    Car(String color){
        this.color = color;
        numofcar ++;
        if(color == "yellow" || color == "YELLOW") {
            numofyellowcar ++;
        }
    }
    static int getnumofcar() {
        return numofcar;
    }
    static int getnumofyellowcar() {
        return numofyellowcar;
    }
}

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car("yellow");
        Car c2 = new Car("red");
        Car c3 = new Car("YELLOW");
        System.out.printf("자동차수 : %d ,노란색 자동차 수:%d",Car.getnumofcar(), Car.getnumofyellowcar());
    }

}
