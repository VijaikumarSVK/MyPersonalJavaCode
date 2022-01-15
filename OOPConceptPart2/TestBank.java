package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		// static polymorphism
		// because we are overriding method from other interface
		VJRJBank a = new VJRJBank();
		a.credit();
		a.CarLoan();
		a.debit();
		a.EducationLoan();
		a.HouseLoan();
		a.TransferMoney();
		a.VehicleLoan();

	System.out.println("*******");
		
	// dynamic polymorphism
	// child class object can be referred by parent Interface reference variable
		USBank b = new VJRJBank();
		b.credit();
		b.debit();
		b.TransferMoney();
		
		System.out.println("*******");
		
		System.out.println(USBank.min_bal);	
}
}