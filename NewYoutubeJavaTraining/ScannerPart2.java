package NewYoutubeJavaTraining;

import java.util.Scanner;

public class ScannerPart2{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		double fsum, ssum, total;
		System.out.println("Enter the first value: ");
		fsum = sc.nextDouble();
		System.out.println("Enter the second value: ");
		ssum = sc.nextDouble();
		total = fsum+ssum;
		System.out.println("total: "+total);
	}
	
}