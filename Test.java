package coding0122;

import java.util.Scanner;

class Person{
	String name;
	int age;
	String live;

 Person(){
	 this("변승현", 18, "용인시");
 }
 Person(String name, int age, String live){
	 this.name = name;
	 this.age = age;
	 this.live = live;
 }
 public String toString() {
	 return "이름 : "+this.name+" 나이 : "+this.age+" 주소  :"+this.live;
 }
 
public boolean findPerson(String s) {
	return false;
	}
}

 public class Test{
	 public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Person("자바", 12, "가나");
		persons[2] = new Person("파이썬", 13, "나다");
		
//		for(Person p : persons) {
//			System.out.println(p);
//		}
		String s = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("찾는 사람의 이름을 입력하시오. 0을 입력하면 종료");
			s = sc.nextLine();
			boolean f = false;
			for(Person p : persons) {
				if(p.findPerson(s)) {
					System.out.println("찾음");
					System.out.println(p);
					f = true;
					break;
				}
			}
			if(!f && !s.equals("0")) {
				System.out.println(s+"인 이름을 찾을 수 없습니다");
			}
			System.out.println("=====================================");
		}while(!s.equals("0"));
		System.out.println("종료.");
	 }
	 
 	}
 
