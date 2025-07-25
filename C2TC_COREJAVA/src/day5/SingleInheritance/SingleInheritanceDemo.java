package day5.SingleInheritance;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Citizen c = new Citizen("Naresh", "258741962525", "Puducherry", 9159186845L);
		System.out.println(c);
		
		Student student = new Student("Kumar", "8080808080", "Bangalore", 9888878787L, 10, "City College");
		System.out.println(student);

	}

}
