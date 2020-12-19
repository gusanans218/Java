package practice20201219;

class EmployeeInfo1{
	public int rank;
	public EmployeeInfo1(int rank) {this.rank = rank;}
		
	}
class Person1<T, S>{
	public T info;
	public S id;
	Person1(T info, S id){
		this.info = info;
		this.id = id;
	}
}
class A1219 {
	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer>p1 = new Person<EmployeeInfo, Integer>(e,i);
		System.out.println(p1.id.intValue());
	}
}
