package polymorphism;

public class Onseason {
	
	double price;
	double discount;
	
	public double discount(double price) {
		double discount = price * 0.4;
		System.out.println("Discount in Onseason: " + discount);
		return discount;
		
	}

}
