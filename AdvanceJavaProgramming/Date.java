package AdvanceJavaProgramming;
import java.util.Scanner;

public class Date {
	
	static int month;
	static int day;
	static int year;
	
	Date() {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	static void get() {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the month");
		month = x.nextInt();
		System.out.println("Enter the date");
		day = x.nextInt();
		System.out.println("Enter the year");
		year = x.nextInt();
	}
	
	static void set() {
		System.out.println(month + "/" + day + "/" + year);
	}
	
	public static void main(String args[]) {
		Date myObj = new Date();
		myObj.get();
		myObj.set();
	}
}