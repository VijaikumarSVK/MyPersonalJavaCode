package javaBasics;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		//++
		//--
		int i = 1;
		int j = i++; // post increment 
		System.out.println(i);
		System.out.println(j);

		int a = 1;
		int b = ++a; // pre increment
		System.out.println(a);
		System.out.println(b);
		
		int c = 2;
		int d = c--; // post decrement 
		System.out.println(c);
		System.out.println(d);
		
		int e = 5;
		int f = --e; // pre decrement
		System.out.println(e);
		System.out.println(f);
	}

}
 