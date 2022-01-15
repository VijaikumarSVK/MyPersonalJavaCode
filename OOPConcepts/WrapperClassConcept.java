package OOPConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//Data conversion availabel in (Integer, Double, Boolean,)----->parse. and     String--->valueof
		String a = "324354";
		int c = 1000001;
		System.out.println(a+c);
		
		//converstion of string to Integer
		int b = Integer.parseInt(a);
		System.out.println(b+c);
		
		String d = "5445.32654";
		System.out.println(d+200000);
		
		//converstion fo string to double 
		double f = Double.parseDouble(d);
		System.out.println(f+200000);
		
		int i = 343143;
		System.out.println(i+324534);
	
		//conversion of int to string
		String j = String.valueOf(i);
		System.out.println(j+32115645);
		
		String k ="100fdf";   
		System.out.println(k);
		
//		int l = Integer.parseInt(k);// Number format Exception---for input string-->100fdf
//		System.out.println(l);
		
		String g = "tdfdfagaggsdrdafdfew";
		System.out.println(g);
		
		//conversion of g
		boolean h = Boolean.parseBoolean(g);
		System.out.println(h);
		
		String t = String.valueOf(h);
		System.out.println(t);
		
	}

}
