package aggregation;

public class Book {

	String name;
	int price;
	Author a;

	public Book(String name, int price, Author a) {

		this.name = name;
		this.price = price;
		this.a = a;

	}

	public static void main(String[] args) {

		Author ab = new Author("shakespere", 89, "Italy");
		Book b = new Book("Romeo and juliet", 70, ab);

		System.out.println(ab.age);
		System.out.println(ab.name);
		System.out.println(ab.place);
		System.out.println(b.name);

		System.out.println(b.price);

	}

}
