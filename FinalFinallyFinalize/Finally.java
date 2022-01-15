package FinalFinallyFinalize;

public class Finally {
	public static void main(String[] args) {
		sample();
	}

	public static void sample() {

		
		try {
			System.out.println(10/0);	
		} catch (ArithmeticException ae) {
			System.out.println("given number cannot divided");
		} finally {
			System.out.println("always gives this out put statment");
		}
	}

}