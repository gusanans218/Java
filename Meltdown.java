package sec04;

public class Meltdown {
	public static void main(String[] args) {
		show(new String("¸àºØ"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
	}

	private static void show(Object object) {
		System.out.println(object);
	}

	
}
