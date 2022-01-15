package OOPConcepts;

public class StaticAndNonStatic {

	// global variable: the scope of global variable will be available across
	// all the functions with some conditions.

	String name = "tom"; // global variable
	static int age = 25; // local variable

	public static void main(String[] args) {

		// how to call static methods and variable
		// 1.direct calling
		sum();
		// 2. calling by class name
		StaticAndNonStatic.sum();

		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
    
		// how to call non static method and variable
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.kamarajar(); // non static method
		System.out.println(obj.name);// non static global variable

		// can i access static methods by using object reference ? yes
//		obj.sum();

	}

	public void kamarajar() { // non static method
		System.out.println("kamarajar method");
	
	}

	public static void sum() { // static method
		System.out.println("sum method");
	}

}
