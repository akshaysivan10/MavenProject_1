package superKeywordAssignment;

public class Result extends Addition {

	int div;

	public Result(int a, int b) {
		super(a, b);
	}
	
	public void printDetails() {
		if (sum % 10 == 0) {
			System.out.println("The number is divisible by 10");
		} else {
			System.out.println("The number is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Result r = new Result(20, 45);
		r.printDetails();;
	}

}
