package javaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String x[][] = new String[3][5];

		System.out.println(x.length); // output will be 3 it means total no of
										// rows
		System.out.println(x[0].length); // output will be 5 it mean total no of
											// coloumns

		System.out.println("**********");

		// 1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "c";
		x[0][3] = "D";
		x[0][4] = "E";

		// 2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "c1";
		x[1][3] = "D1";
		x[1][4] = "E1";

		// 3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "c2";
		x[2][3] = "D2";
		x[2][4] = "E2";

		System.out.println(x[0][2]);
		System.out.println(x[2][2]);
		System.out.println(x[2][4]);
		System.out.println("***********");

		// if we want to print all the values of 2D array: use For loop
		// row =0, col= 0 to 4
		// row =1, col= 0 to 4
		// row =2, col= 0 to 4

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
		System.out.println("############");
		
		Object y[][] = new Object[5][5];
		 
		System.out.println(y.length);
		System.out.println(y[0].length);
		
		y[0][0] = "appa";
		y[0][1] = "appa";
		y[0][2] = "appa";
		y[0][3] = "appa";
		y[0][4] = "appa";
		
		y[1][0] = "appa";
		y[1][1] = "appa";
		y[1][2] = "appa";
		y[1][3] = "appa";
		y[1][4] = "appa";
		
		y[2][0] = "appa";
		y[2][1] = "appa";
		y[2][2] = "appa";
		y[2][3] = "appa";
		y[2][4] = "appa";
		
		y[3][0] = "appa";
		y[3][1] = "appa";
		y[3][2] = "appa";
		y[3][3] = "appa";
		y[3][4] = "appa";
		
		y[4][0] = "appa";
		y[4][1] = "appa";
		y[4][2] = "appa";
		y[4][3] = "appa";
		y[4][4] = "appa";
		
		for (int t=0;t<y.length;t++){
			for (int r=0;r<y[0].length;r++){
				System.out.println(y[t][r]);
			}
		}
		
	}

}
