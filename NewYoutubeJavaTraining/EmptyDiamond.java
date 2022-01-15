package NewYoutubeJavaTraining;

import java.util.Scanner;

 class EmptyDiamond {

	public static void main(String[] args) {

			int i, j, row;
			System.out.println("Enter the number of STARS:");
			Scanner scan = new Scanner(System.in);
			row = scan.nextInt();
			for (i = 0; i <= row; i++) {
				for (j = i; j <= row; j++) {
					System.out.print(" ");
				}
				for (j = 0; j <= i; j++) {
					if (j == 0 || j == row || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			for (i = 1; i <= row; i++) {
				for (j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				for (j = row; j >= i; j--) {
					if (j == row || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
 
