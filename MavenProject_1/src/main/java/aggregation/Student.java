package aggregation;

public class Student {
	
	String name;
	int rollNo;
	Address a;
	
	public Student(String name, int rollNo, Address a) {
		this.name=name;
		this.rollNo=rollNo;
		this.a=a;
	}
	
	public static void main(String[] args) {
		Address ad = new Address("Malappuram");
		Student s = new Student("Akshay", 10, ad);
		
		System.out.println("Student Name: " + s.name);
		System.out.println("Student RollNo: " + s.rollNo);
		System.out.println("Student Address: " + ad.address);
	}

}
