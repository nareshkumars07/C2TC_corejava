package day2;

public class Constructor {
	private int ID;
	private String Name;
	private float Salary;
	//default constructor
	public Constructor() {
		this.ID= 101;
		this.Name = "Naresh";
		this.Salary = 50000;
		}
	//Parameterized constructor
	public Constructor(int ID , String Name, float Salary) {
		this.ID = ID;
		this.Name = Name;
		this.Salary = Salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Constructor [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
}
