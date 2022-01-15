package OOPConcepts;

public class FunctionInJava {
	// main method-->is a starting point of execution
	public static void main(String[] args) {
		 
	FunctionInJava obj = new FunctionInJava();
	//one object wil be created. vijai- is the reference variable, referring the object
	// after creating the object, the copy of all non static methods will be given to this objects
	
	obj.abc();
	
	int l = obj.mnop();
	System.out.println(l);
	
	String y = obj.nmp();
	System.out.println(y);
	
	int z = obj.multiplication(50, 25);
	System.out.println(z);
	
	//main method is a void--> because its never returns a value
	
	}
	// non static methods
	// void -- does not return any value
	public void abc() { // return type = void (void does not any return value so
						// we can't use void for any returns need)
		System.out.println("abc");
	} 

	public int mnop() {
		System.out.println("mnop method");
		int a = 10;
		int b = 20;
		int o = 200;
		int c = a + b*o;
		return c;
	}

	// return type--> String
	public String nmp() { // no input, some output
		System.out.println("nmp method");
		String j = "Hi dude ";
		String u = "how are you";
		String q = " ,humm iam good.What about you";
		String b = " Humm yeah dude iam also fine ";
		String h = j+u+q+b;
		
		return h;
	}

	// return type-->int
	// x,y--> is a parameters/arguments;
	public int multiplication(int x, int y) {
		System.out.println("multiplication method");
		int d = x * y;

		return d;
	}

}
	