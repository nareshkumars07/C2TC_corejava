package day5.SingleInheritance;

public class Student {
	private int rollNo;
	private String collegeName;

	public Student() {
		super();
	}

	public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {
		super(); //accessing parent class constructor
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno()
				
				+ "]";
	}

	private String getPhno() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAadharNo() {
		// TODO Auto-generated method stub
		return null;
	}
}
