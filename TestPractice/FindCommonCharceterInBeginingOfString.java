package TestPractice;

import java.util.Scanner;

public class FindCommonCharceterInBeginingOfString {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of input: ");
		int input = sc.nextInt();

		String input_arr[] = new String[input];

		for (int i = 0; i < input; i++) {
			input_arr[i] = sc.next();
		}
		FindCommonCharceterInBeginingOfString obj = new FindCommonCharceterInBeginingOfString();
		String result = obj.result_method(input_arr);
		System.out.println("Name of the area is: " + result);
	}

	public String result_method(String inputarr[]) {

		String temp = inputarr[0];

		for (int i = 1; i < inputarr.length; i++) {

			String temp2 = inputarr[i];

			for (int j = 0; j < temp.length(); j++) {

				String ch1 = Character.toString(temp.charAt(j));
				String ch2 = Character.toString(temp2.charAt(j));
				if (ch1.equals(ch2)) {

				} else {
					temp = temp.substring(0, j);
					break;
				}
			}
		}
		return temp;
	}
}
