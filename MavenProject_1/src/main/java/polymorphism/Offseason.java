package polymorphism;

public class Offseason extends Onseason {
	
	public double discount(double price) {
		double discount = price * 0.15;
		System.out.println("Discount in Offseason: " + discount);
		return discount;
		
	}
	
	public static void main(String[] args) {
		Onseason o; 
		o = new Onseason();
		o.discount(2500);
		o = new Offseason();
		o.discount(2500);
		
	}

}
