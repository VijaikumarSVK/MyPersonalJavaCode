package AdvanceJavaProgramming;

import java.util.Scanner;
public class Health_Profile {
	String firstsname;
	String lastname;
	String gender;
	short height;
	short weight;
	
	Health_Profile(String name, String genders){
		firstsname = name;
		gender = genders;
	}
	
	public void setname(String name){
		this.firstsname = name;
	}
	public String getname(){
		return firstsname;
	}
	public void setgender(String gender){
		this.gender = gender;
	}
	public String getgender(){
		return gender;
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the gender:");
		String gender = sc.next();
		Health_Profile obj = new Health_Profile(name,gender);
		System.out.println("the first name is: "+obj.getname());
		System.out.println("Your gender is:"+obj.getgender());
	}
}
