package superKeywordUse2;

public class Dog extends Animal {
	
	public void eat() {
		System.out.println("Dog is Eating");
	}
	
	public void bark() {
		System.out.println("Dog is Barking");
	}
	
	public void action() {
		super.eat();
		bark();
		eat();
	}
	
	public static void main(String[] args) {
		Dog g = new Dog();
		g.action();
	}

}
