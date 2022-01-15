package CyberSecurity;

import java.util.Arrays;
import java.util.Scanner;

public class CipherText {

	public static StringBuilder encrypt(String text, int s) {

		StringBuilder result = new StringBuilder();
		int len = text.length();
		char charry[] = new char[len];
		String str = text.toLowerCase();
		int key = s;
		for (int i = 0; i < len; i++) {
			int ascii = (int)str.charAt(i);
			ascii+=key;
			charry[i] = (char)ascii;
		}
		result.append(charry);
		return result;
	}

	public static StringBuilder decrypt(String text, int s) {

		StringBuilder result = new StringBuilder();
		int len = text.length();
		char charry[] = new char[len];
		String str = text.toLowerCase();
		int key = s;
		for (int i = 0; i < len; i++) {
			int ascii = (int)str.charAt(i);
			ascii = ascii-key;
			charry[i] = (char)ascii;
		}
		result.append(charry);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n == 0) {
			System.out.println("Enter your choice:");
			System.out.println("1.Encode\n2.Decode\n3.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your text to Encode: ");
				String text = sc.next();
				System.out.println("Enter key:");
				int key = sc.nextInt();
				System.out.println("Text : " + text);
				System.out.println("Shift key : " + key);
				System.out.println("Encode Text: " + encrypt(text, key));
				break;
			case 2:
				System.out.println("Enter your text to Decode: ");
				String text2 = sc.next();
				System.out.println("Enter key:");
				int key2 = sc.nextInt();
				System.out.println("Text : " + text2);
				System.out.println("Shift key : " + key2);
				System.out.println("Decoded Text: " + encrypt(text2, key2));
				break;
			case 3:
//				n = 1;
				System.out.println("*********Thank you***********");
				System.exit(0);
				break;
			}
		}
	}
}
