package coding0102;

public class OverloadingTest {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) ��� :"+mm.add(3,3));
		System.out.println("mm.add(3L,3) ��� :"+mm.add(3L,3));
		System.out.println("mm.add(3,3L) ��� :"+mm.add(3,3L));
		System.out.println("mm.add(3L,3L) ��� :"+mm.add(3L,3L));
		
		int[]a = {100,200,300};
		System.out.println("mm.add(a) ���:"+mm.add(a));
	}
}
class MyMath3{
	int add(long l, long m) {
		System.out.print("int add(int a, int b)-");
		return (int) (l+m);
	}
	
	int add(int[]a) {
		System.out.print("int add(int[] a)-");
		int result = 0;
		for(int i = 0; i<a.length; i++) {
			result +=a[i];
		}
		return result;
	}
}
