package javaBasics;

public class IfelseConcept {

	public static void main(String[] args) {

		int i = 45;
//
		double d = 44.99;

		if (d > i) {	
			System.out.println("d is greater than i");
		} else {
			System.out.println("i is greater than d");
		}

//		 comparison operators:
//		 < > <= >= == !=

		int y = 22;
		int x = 25;

		if (y == x) {
			System.out.println("y is  equal  to x");
		} else {
			System.out.println("y is  not equal  to x");
		}
//		 write a logic to find out a highest number

		int a = 400;
		int b = 500;
		int c = 300;
		
		//nested if-else
		if (a>b & a>c){
			System.out.println("a is greater");
		}
		else if (b>c){
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
		
	}
 
}
