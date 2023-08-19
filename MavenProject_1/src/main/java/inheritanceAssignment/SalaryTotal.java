package inheritanceAssignment;

public class SalaryTotal extends SalaryCalculation{

	public void totalSalary() {
		
		double totalSalary = basicPay+hra-pf-deduction+bonus;
		System.out.println("Total Salary: " + totalSalary);
		
	}

}
