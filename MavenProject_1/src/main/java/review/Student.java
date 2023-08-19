package review;

public class Student {
	
	String name;
	int rollNo;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void display() {
		System.out.println(rollNo + " " + name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(10, "Akshay");
		Student s2 = new Student(11, "Ajay");
		s1.display();
		s2.display();
		
		String s3 = "Sachin";
		s3= "Sachin Tendulkar";
		System.out.println(s3);
	}

}
