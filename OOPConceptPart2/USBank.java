package OOPConceptPart2;

public interface USBank {
	 
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void TransferMoney();
	
	//only method declaration
	//no method body - only method prototype
	//in Interface, we can declare the variable, variable are by default static in nature
	//variable value will not be changed, and its final/constant in nature
	//no static method in Interface
	//no main method in Interfaces
	//Interface is abstract in nature 
	
}
