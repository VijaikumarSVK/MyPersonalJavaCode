package javaBasics;

public class StringConcatenation {
	
	//+ : is a concatenation operator
	// pritnln is used to print on the console with a new line 
	// print -- is just used to print on the console

	public static void main(String[] args) {
		
		int a = 150;
		int b = 250;
		
		String x = "hello";
		String y = "world";
		
		double d = 33.33;
		double c = 22.45;
		
		System.out.println(a+b);
		
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(y+x+b+a);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(d+c);
		System.out.println(a+b+d+c+x+y);
		System.out.println(x+y+d+c);
		
		System.out.print("do you have any money");
		System.out.println("yes i have");
		System.out.print("how much do you have:"+(a+b+d+c));
		
		System.out.println("the addition of a and b is:"+(a+b));
	}

}
