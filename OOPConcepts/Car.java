package OOPConcepts;

public class Car {
	
	//Class variables
	String mod;
	String color;
	char weel;
	int wheel;

	public static void main(String[] args) { 
		 
		//new Car();-- this is the object of car class;
		//new keyword is used to create the object
		//a,b,c is the reference variable for the objects
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = "mahendra jeep 125";
		a.weel = '4';
		a.color = "black";
		a.wheel = 2121;
		
		System.out.println(a.mod);
		System.out.println(a.color);
		System.out.println(a.weel);
		System.out.println(a.wheel);
		
		System.out.println("****************");
		
		b.mod = "BMW 32134";
		b.weel = '8';
		b.color = "orange";
		b.wheel = 1465444;
		
		System.out.println(b.mod);
		System.out.println(b.color);
		System.out.println(b.weel);
		System.out.println(b.wheel);
		
		System.out.println("****************");

		
		c.mod = "AUDI T-SERIES";
		c.weel = '3';
		c.color = "pink";
		c.wheel = 874651702;
		
		System.out.println(c.mod);
		System.out.println(c.color);
		System.out.println(c.weel);
		System.out.println(c.wheel);
		
	}

}
 