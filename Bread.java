package exam01;

public class Bread {
	String souce;
	double price;
	String box;
	
	void show() {
		System.out.print("�ҽ��� : "+ souce+" ������: "+price+" ����� : "+box);
	}
	
	public static void main(String[] args) {
		Bread b1 = new Bread();
		b1.souce = "�ӽ�Ÿ��";
		b1.price = 5500;
		b1.box = "�ݿ�";
		b1.show();
	}
}
