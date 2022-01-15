package AdvanceJavaProgramming;

public class Test6 {
	static boolean palindrome(String str) {
		int l = 0;
		int h = str.length() - 1;

	
		str = str.toLowerCase();

		// Compares character until they are equal
		while (l <= h) {

			char getAtl = str.charAt(l);
			char getAth = str.charAt(h);

			// If there is another symbol in left
			// of sentence
			if (!(getAtl >= 'a' && getAtl <= 'z'))
				l++;

			// If there is another symbol in right
			// of sentence
			else if (!(getAth >= 'a' && getAth <= 'z'))
				h--;

			// If characters are equal
			else if (getAtl == getAth) {
				l++;
				h--;
			}

			
			else
				return false;
		}

		
		return true;
	}

	public static void main(String[] args) {
		String str = "i there ereht i";
		if (palindrome(str))
			System.out.println("Sentence is palindrome");
		else
			System.out.println("Sentence is not" + " " + "palindrome");
	}
}