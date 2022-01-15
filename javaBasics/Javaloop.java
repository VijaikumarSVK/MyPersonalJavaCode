package javaBasics;

public class Javaloop {

	public static void main(String[] args) {

		// 1. while loop
		// disadvantage of while loop is it will generate infinte loop if you
		// don't incremental/decremantal operator

		int i = 1; // initialization
		while (i <= 5) { // conditional
			System.out.println(i);
			i = i + 1; // incremental / decremantal operator
		}

		System.out.println("***********");

		// j++ means j = j+1
		// 2. for loop
		// print 1 to 10
		for (int c = 1; c <= 10; c++) { // initialization, condition,
										// incremental/ decremantal
			System.out.println(c);
		}

		System.out.println("**********");

		// print 10 to1
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

	}
}