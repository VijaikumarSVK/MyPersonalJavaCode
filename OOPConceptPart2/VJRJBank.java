package OOPConceptPart2;

public class VJRJBank implements USBank, UKBank { //we are achieving multiple inheritance
	// Is-a relationship
	
	//if a class is implementing any Interface, them its mandatory to define/override all the methods of Interface
	
	//first three method we are overriding from USBank
	public void credit() {
		System.out.println("USBank.....credit");
		}
	public void debit() {
		System.out.println("USBank.....debit");
	}
	public void TransferMoney() {
		System.out.println("USBank.....TransferMoney");
	}
	
	// these two method separate methods of VJRJBank  class
	public void EducationLoan() {
		System.out.println("VJBank.....EducationLoan");
	}
	public void CarLoan() {
		System.out.println("VJBank.....CarLoan");
	}
	
	//these two method are from UKBank: overriding from UKBank
	public void VehicleLoan() {
		System.out.println("UKBank.....VehicleLoan");
	}
	public void HouseLoan() {
		System.out.println("UkBank.....HouseLoan");
	}
}
