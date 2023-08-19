package polymorphism;

public class MethodOverloading {

	public int multiply(int a, int b) {

		return a * b;
	}

	public double multiply(double a, double b) {
		return a * b;

	}

	public static void main(String args[]) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.multiply(7, 9));
		System.out.println(mo.multiply(9.0, 4.1));
	}

}
