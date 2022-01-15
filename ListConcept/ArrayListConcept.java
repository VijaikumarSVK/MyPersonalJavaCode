package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int o[] = new int[5]; // static array--> size is fixed

		// non generic concept in java
		ArrayList a = new ArrayList();

		a.add(10);// 0
		a.add(20);// 1
		System.out.println(a.size());

		a.add(40);// 2
		a.add(54254.32143);// 3
		a.add("baby");// 4
		a.add('d');// 5
		a.add(true);// 6

		System.out.println(a.size());

		System.out.println(a);
		System.out.println(a.get(5));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		// generic concept in java
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(132121);
		b.add(31);

		System.out.println("*********");

		ArrayList<String> c = new ArrayList<String>();
		c.add("ojfkldj");
		c.add("dfdf");

		ArrayList<E> d = new ArrayList<E>();

		// Employee class object
		Employee e1 = new Employee("vijai", 21, "mail room");
		Employee e2 = new Employee("richard", 23, "KYC");
		Employee e3 = new Employee("naveen", 20, "Bcom");

		// create array list
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);

		// iterator to traverse the value
		Iterator<Employee> it = ar.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("*****");

		// addAll()
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("vijai");
		ar1.add("kumar");
		ar1.add("deepa");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("7358959474");
		ar2.add("6379690587");

		ar1.addAll(ar2);
		System.out.println(ar1.size());
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("******");

		// removeAll()
		ar1.removeAll(ar2);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("******");

		// retainAll()
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("vijai");
		ar3.add("deepa");

		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("vijai");
		ar4.add("kumar");

		ar3.retainAll(ar4);
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));
		}	
	}
}

















