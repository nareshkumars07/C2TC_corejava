package day6.StaticVariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e = new Employee("Naresh", 123);
		System.out.println(e);
		
		e = new Employee("Kumar", 321);
		System.out.println(e);

	}

}
