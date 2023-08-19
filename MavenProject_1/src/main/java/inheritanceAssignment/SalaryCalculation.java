package inheritanceAssignment;

public class SalaryCalculation extends Salary {
	
	double hra;
	double pf;
		
	public void calculation() {
	
		hra = basicPay*0.05;
		pf = basicPay*0.2;
		
	}

}
