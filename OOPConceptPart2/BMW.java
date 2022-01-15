package OOPConceptPart2;

public class BMW extends Car { //"has-a relationship" 
	
	//when same method is present in parent class as will as in child class with the same name and same number of arguments,
	//is called method-overriding
	
	public void start() {
		System.out.println("BMW....start");
		BMW e = new BMW();
		e.wheel();
}

	public void theftsafety() {
		System.out.println("BMW....theftsafety");

	}
}
