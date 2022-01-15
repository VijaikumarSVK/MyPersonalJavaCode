package CSEndSemLab;

public class CaesarCipherQuestion1 {

	public static void main(String[] args) {

		String text = "A GOOD TONGUE IS A GOOD WEAPON";
		int key = 6;
		System.out.println("Plain Text 		: " + text);
		System.out.println("Given key		: " + key);
		System.out.println("Ciphered Text		: " + encrypt(text, key));
	}

	public static StringBuffer encrypt(String text, int s) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}
	
}
