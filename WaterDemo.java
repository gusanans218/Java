package exam01;

public class WaterDemo {
	public static void main(String[] args) {
		Water Samdasu = new Water();
		Samdasu.liter = 1.5;
		Samdasu.brand = "»ï´Ù¼ö";
		Samdasu.price = 1000;
		Samdasu.print();
		
		Water Evian = new Water();
		Evian.liter = 0.5;
		Evian.brand = "¿¡ºñ¾Ó";
		Evian.price = 1500;
		Evian.print();
		
		Water w3 = new Water(1.8, "µ¿¿ø»ù¹°", 1500);
		w3.print();
		
		Water w4 = new Water(0.5,"Ç®¹«¿ø»ù¹°");
		w4.print();
		
		
	}
	
}
