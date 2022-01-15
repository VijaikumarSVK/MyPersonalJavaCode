package AdvanceJavaProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class Java_Assesment {
	private static int[] arrval = new int[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int remain = 0;

		while (remain != 5) {
			System.out.printf("Enter value %d/5 between 10 and 100: ", remain + 1);
			int num = sc.nextInt();

			if (num < 10 || num > 100)
				continue;

			if (isUnique(num))
				System.out.printf("Unique value: %d\n", num);

			try {
				arrval[remain++] = num;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			original();
		}
	}

	public static boolean isUnique(int num) {
		for (int i = 0; i < arrval.length; i++) {
			if (arrval[i] == num)
				return false;
		}
		return true;
	}

	public static void original() {
		System.out.println("\noriginal values:\n");

		System.out.print(arrval[0] + " ");

		int unique = 0;

		for (int i = 1; i < arrval.length; i++) {
			if (arrval[i] > 0) {
				for (int j = i - 1; j >= 0; j--) {
					if (arrval[i] == arrval[j]) {
						unique = 0;
						break;
					} else {
						unique = arrval[i];
					}
				}
				if (unique > 0)
					System.out.print(unique + " ");
			} else {
				continue;
			}
		}
		System.out.println();
	}
}
