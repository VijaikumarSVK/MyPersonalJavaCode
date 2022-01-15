package javaBasics;

public class ConstructorWithThisKeyword {
	
	String s;
	int g;
	
	
	public ConstructorWithThisKeyword(String name, int age){
		this.s = name;
		this.g = age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
	

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("vijai", 21 );
		
		System.out.println(obj.s);
		
	}
}
 