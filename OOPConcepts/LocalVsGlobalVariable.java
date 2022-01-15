package OOPConcepts;

public class LocalVsGlobalVariable {
	
	//global variable-->class variable
	String s = "dell"; //global variable is, declare a variable in before a main method
	int i = 5442;     // by this global variable we can use to call it in any method 
	double d = 2424.7734;
	
	
	public static void main(String[] args) {
		int i = 21321;         //this i is local variable for main method
		String h = " samsung"; // local variable
		System.out.println(i+h);
		
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
			String w = obj.mnop();
			System.out.println(w);
		
		 
		LocalVsGlobalVariable obj1 = new LocalVsGlobalVariable();
		System.out.println(obj1.d);
		System.out.println(obj1.s);
		System.out.println(obj1.i);
		}

	public String mnop() {
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.d);
		System.out.println(obj.s);
		System.out.println(obj.i);
		System.out.println("ruby method");
		String i = "hdfc ";		// local variable
		String q = "icici";		// local variable
		String s = i+q;
		return s;

	}	
}
