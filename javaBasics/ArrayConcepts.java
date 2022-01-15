 package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {

		// array: array to store a similar data type values in a array variable

		// now we are seeing One Dimensional Array
		// dis-advantage of array
		// 1. size is fixed-- static array--To overcome this problem--we use
		// Collections--(ArrayList, Hashtable-- these are dynamic array)
		// 2. stores only similar data types-- To overcome this problem--we use
		// object array

		// 1. int array;
		// lowest bound/index = 0;
		// upper bound/index = n-1 (n is the size of the array)

		int i[] = new int[8];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60;
		i[6] = 70;

		System.out.println(i[0]);
		System.out.println(i[3]);
		System.out.println(i[2]);

		System.out.println(i[4]);
		System.out.println(i[6]);

		// System.out.println(i[9]); //ArrayIndexOutofBoundsException

		System.out.println("***********");

		System.out.println(i.length); // it will give u the size of an array (in
										// this example 8 is the size)

		System.out.println("***********");

		// print all the values of array use for loop

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("************");

		// 2. double array
		double d[] = new double[5];
		d[0] = 10.1;
		d[1] = 20.2;
		d[2] = 30.3;
		d[3] = 40.4;
		d[4] = 50.5;

		System.out.println(d[4]);

		// 3. char array;
		char c[] = new char[4];
		c[0] = 'd';
		c[1] = '%';
		c[2] = '5';
		c[3] = '#';

		System.out.println(c[2]);
		System.out.println(c[3]);

		// 4. boolean array
		boolean b[] = new boolean[2];

		b[0] = true;
		b[1] = false;
		System.out.println(b[1]);

		// 5.String array
		String s[] = new String[3];
		s[0] = "vijai ";
		s[1] = "kumar ";
		s[2] = "S";
		System.out.println(s.length);
		System.out.println(s[0] + s[1] + s[2]);
 
		System.out.println("***********");

		// 6. Object Array: (object is a clas)

		Object ob[] = new Object[6];
		ob[0] = "vijai kumar s";
		ob[1] = 21;
		ob[2] = 54.75;
		ob[3] = "19/03/1999";
		ob[4] = 'M';
		ob[5] = "chennai";

		System.out.println(ob.length);
		System.out.println(ob[5]);
		
		for (int  x=0;x<ob.length;x++){
			System.out.println(ob[x]);
		}

	}

}
