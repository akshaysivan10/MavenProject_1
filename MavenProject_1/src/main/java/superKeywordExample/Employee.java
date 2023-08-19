package superKeywordExample;

public class Employee extends Person {

	float salary;

	public Employee(int id, String name, float salary) {
		super(id, name);
	}

	public void printdetails() {
		System.out.println(id + " " + name + " " + salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(2, "Akshay", 5000.00f);
		emp.printdetails();

	}

}
