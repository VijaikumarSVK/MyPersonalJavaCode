package OOPConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		int a = 654654;
		int b = 546544;
		int c = a + b;
		System.out.println(c);

		MethodOverloading obj = new MethodOverloading();
		obj.abc();
		int h = obj.abc(500);
		System.out.println(h);
		obj.abc(50, 60);		
	}
	
	//we can overload main method also
	//we cannot create a method inside a method
	//duplicate method --> ie., same method name with different arguments/parameters are not allowed
	
	//method overloading--> when the method name is same with different arguments or input parameters within the same class
	
	
	public static void main(int i){   // we can also use two main method, but with different parameters/arguments 
		
	}
	public static void main(int i, int j){ // we can also use two main method, but with different parameters/arguments.
	}

	public void abc() { // 0 input parameter

		System.out.println("abc$$$$$$$");
	}

	public int abc(int i) { //1 input parameter
		System.out.println("abcd##");
		int j = 24;
		int f =i*j;
//		System.out.println(i * j);
		return f;
	}

	public void abc(int i, int j) { //2 input parameter
		System.out.println("abc@@@");
		System.out.println(i * j);

	}

}
