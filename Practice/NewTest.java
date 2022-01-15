package Practice;

import java.util.*;

public class NewTest {
	public static void main(String[] args) {

		ArrayList<String> str1 = new ArrayList<String>();
		ArrayList<String> str2 = new ArrayList<String>();
		int i, temp, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		String temp_str1;
		System.out.println("Enter string");
		for (i = 0; i < n; i++) {
			temp_str1 = sc.next();
			str1.add(temp_str1);
		}
		System.out.println("Enter query n: ");
		int qn = sc.nextInt();
		String temp_str2;
		System.out.println("Enter query string");
		for (i = 0; i < qn; i++) {
			temp_str2 = sc.next();
			str2.add(temp_str2);
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (i = 0; i < str2.size(); i++) {
			temp = 0;
			String temp1 = str2.get(i);
			for (j = 0; j < str1.size(); j++) {
				String temp2 = str1.get(j);
				if (temp1.equals(temp2)) {
					temp++;
				}
			}
			arr.add(temp);
		}
		for (i = 0; i < str2.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
