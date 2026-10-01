public class Main {

	public static void main(String[] args) {
		System.out.println(greet("World", "unused"));
	}

	public static String greet(String name, String unused) {
		return "Hello " + name;
	}
}
