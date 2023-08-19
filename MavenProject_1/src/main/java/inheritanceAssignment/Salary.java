package inheritanceAssignment;

import java.util.Scanner;

public class Salary {
	
	double basicPay;
	double deduction;
	double bonus;
	
	public void salaryDetails() {
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Basic Pay");
		basicPay = obj.nextDouble();
		
		System.out.println("Enter the Deduction");
		deduction = obj.nextDouble();
		
		System.out.println("Enter the Bonus");
		bonus = obj.nextDouble();
	}

}
