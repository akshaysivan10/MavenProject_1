package java_sessions;

public class StringOperations {

	public static void main(String[] args) {
		
		char a = "Obsqura".charAt(5);
		System.out.println(a);
		
		boolean b = "Obsqura Zone".contains("Obsqura");
		System.out.println(b);
		
		boolean c = "Obsqura Zone".contentEquals("Obsqura");
		System.out.println(c);
		
		boolean String = "Java".equals("Java");
		System.out.println(String);
		
		String name = "Akshay".toUpperCase();
		System.out.println(name);
		
		String group = "OBSQURA".toLowerCase();
		System.out.println(group);
		
		String name1 = "  Akshay Sivan  ".trim();
		System.out.println(name1);
		
		String d = "Akshay".replace("Akshay", "Java");
		System.out.println(d);
		
		String car = "Mahindra".concat(" Thar");
		//car = car.concat(" Thar");
		System.out.println(car);
		
		int e = "Obsqura".length();
		System.out.println(e);
		
		

	}

}
