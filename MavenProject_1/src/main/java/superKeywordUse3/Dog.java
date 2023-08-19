package superKeywordUse3;

public class Dog extends Animal {
	
	public Dog() {
		super();
		System.out.println("This is child class constructor");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
	}

}
