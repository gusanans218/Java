package coding1017;
	import java.util.Scanner;
public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("���� (1), ����(2),��(3)�� �ϳ��� �Է��ϼ��� >");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("����� "+user+"�Դϴ�");
		System.out.println("����"+com+"�Դϴ�");
		
		if(user == com)
		{
			System.out.println("�����ϴ�");
		}
		else if(user>com)
		{
			System.out.println("�̰���ϴ�");
		}
		else
			System.out.println("�����ϴ�");
	}//����� �ؼ� ����ϱ�

}
