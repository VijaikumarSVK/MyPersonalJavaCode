package javaBasics;
public class ConstructorConcept{
	
	public ConstructorConcept(){ // no input parameter
		int j = 31324;
		String s = "54544";
		int c = Integer.parseInt(s);
		System.out.println(c+j);
	}
	
	ConstructorConcept(String v){ //single input parameter 
		boolean g = Boolean.parseBoolean(v);
		System.out.println(g);
	}
		
	ConstructorConcept(double k, double l, double w){ //three input parameters
		System.out.println(k%l);
		System.out.println(w/l);
	}
	
	public static void main(String args[]){
		
		ConstructorConcept h = new ConstructorConcept(); 
		ConstructorConcept d = new ConstructorConcept("true");
		ConstructorConcept y = new ConstructorConcept(54654414,212,777);
	}
}