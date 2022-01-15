package MyOwnProgramm;

import java.util.Scanner;

import NewYoutubeJavaTraining.Practice2;

public class AgeCalculator {
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;

	public static void main(String[] args) {
		AgeCalculator p = new AgeCalculator();
		p.class1();
	}

	public void class1() {
		AgeCalculator p = new AgeCalculator();

		System.out.println("Enter today's date DD/MM/YYYY:");
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		p.a = i1;
		int i2 = sc.nextInt();
		p.b = i2;
		int i3 = sc.nextInt();
		p.c = i3;

		System.out.println("Enter your DOB DD/MM/YYYY:");
		int i4 = sc.nextInt();
		p.d = i4;
		int i5 = sc.nextInt();
		p.e = i5;
		int i6 = sc.nextInt();
		p.f = i6;
		System.out.printf("Today's date     : %d/%d/%d \n", p.a, p.b, p.c);
		System.out.printf("Your DOB         : %d/%d/%d \n", p.d, p.e, p.f);

		int age = p.c - p.f;
		System.out.println("Your Age        :" + age);
		int days = age * 365;
		int leap = age / 4;

		int totaldays = days + leap;
		System.out.println("Total no of days: " + totaldays);
	}
}
