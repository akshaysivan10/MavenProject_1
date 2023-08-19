package inheritanceAssignment;

public class SalarySlip {

	public static void main(String[] args) {
		
		SalaryTotal s = new SalaryTotal();
		s.salaryDetails();
		s.calculation();
		System.out.println();
		System.out.println("Salary Slip");
		System.out.println("***********");
		System.out.println("Basic Pay: " + s.basicPay);
		System.out.println("Deduction: " + s.deduction);
		System.out.println("hra: " + s.hra);
		System.out.println("pf: " + s.pf);
		System.out.println("Bonus: " + s.bonus);
		System.out.println("---------------------");
		s.totalSalary();

	}

}
