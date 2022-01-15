package AdvanceJavaProgramming;

import java.util.Scanner;

public class Test7 {

	static boolean palindrome(String str) {
		int x = 0;
		int y = str.length() - 1;

		str = str.toLowerCase();

		while (x <= y) {

			char getAtx = str.charAt(x);
			char getAty = str.charAt(y);

			if (!(getAtx >= 'a' && getAtx <= 'z'))
				x++;

			else if (!(getAty >= 'a' && getAty <= 'z'))
				y--;

			else if (getAtx == getAty) {
				x++;
				y--;
			}

			else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.next();
		if (palindrome(str))
			System.out.println("Sentence is palindrome");
		else
			System.out.println("Sentence is not palindrome");
	}
}