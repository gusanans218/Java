package coding0122;

import java.util.Scanner;

class Person{
	String name;
	int age;
	String live;

 Person(){
	 this("������", 18, "���ν�");
 }
 Person(String name, int age, String live){
	 this.name = name;
	 this.age = age;
	 this.live = live;
 }
 public String toString() {
	 return "�̸� : "+this.name+" ���� : "+this.age+" �ּ�  :"+this.live;
 }
 
public boolean findPerson(String s) {
	return false;
	}
}

 public class Test{
	 public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Person("�ڹ�", 12, "����");
		persons[2] = new Person("���̽�", 13, "����");
		
//		for(Person p : persons) {
//			System.out.println(p);
//		}
		String s = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("ã�� ����� �̸��� �Է��Ͻÿ�. 0�� �Է��ϸ� ����");
			s = sc.nextLine();
			boolean f = false;
			for(Person p : persons) {
				if(p.findPerson(s)) {
					System.out.println("ã��");
					System.out.println(p);
					f = true;
					break;
				}
			}
			if(!f && !s.equals("0")) {
				System.out.println(s+"�� �̸��� ã�� �� �����ϴ�");
			}
			System.out.println("=====================================");
		}while(!s.equals("0"));
		System.out.println("����.");
	 }
	 
 	}
 
