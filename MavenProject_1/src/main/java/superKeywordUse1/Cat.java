package superKeywordUse1;

public class Cat extends Animal {
	
	String colour = "Black";
	
	public void printColour() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.printColour();
	}

}
