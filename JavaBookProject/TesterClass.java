package JavaBookProject;

public class TesterClass {

	public static void main(String[] args) {

		ObjectClass1 one = new ObjectClass1();
		one.title = "Avenger";
		one.type = "Action";
		one.rating = 9;
		one.movie();

		ObjectClass1 two = new ObjectClass1();
		two.title = "Kingsman";
		two.type = "Action technology";
		two.rating = 7;
		two.movie();
		
		ObjectClass1 three = new ObjectClass1();
		three.title = "Intern";
		three.type = "Patients";
		three.rating = 6;
		three.movie();
		
		
	}

}
