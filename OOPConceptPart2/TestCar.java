package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		// static polymorphism --compile-time polymorphism
		BMW i = new BMW();
		i.start();
		i.theftsafety();
		i.stop();
		i.refuel();
		 
		System.out.println("***********");
		
		
	Car j = new Car();
		j.stop();
		j.refuel();
		j.start();
		j.wheel();
		
		System.out.println("*******");
		
		//top casting   
	Car h =new BMW(); //child class objec t can be  referred by parent class reference variable--dynamic polymorphism--> run-time polymorphism
		h.refuel();
		h.start(); 
		
		Vehicle M = new Vehicle();
		M.wheel();
		
		//down casting
		BMW b = (BMW)new Car(); //classCasExcemption
		
		
}
}