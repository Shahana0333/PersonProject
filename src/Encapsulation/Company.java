package Encapsulation;

public class Company {

	public static void main(String[] args) {
	 Employee e1=new Employee();
	 e1.setName("Shana");
	 e1.setPhone(876543566);
	 e1.setAge(21);
	 System.out.println(e1.getName());
	 System.out.println(e1.getAge());
	 System.out.println(e1.getPhone());
	 
	 Employee e2=new Employee();
	 e2.setName("Shanes");
	 e2.setAge(31);
	 e2.setPhone(894214567);
	 System.out.println(e2.getName());
	 System.out.println(e2.getAge());
	 System.out.println(e2.getPhone());
	 
	 Employee e3=new Employee();
	 e3.setName("Rahul");
	 e3.setPhone(8954567);
	 e3.setAge(34);
	 System.out.println(e3.getName());
	 System.out.println(e3.getAge());
	 System.out.println(e3.getPhone());
	}

}
