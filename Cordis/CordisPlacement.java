package Cordis;

import java.lang.Math;
import java.util.*;

public class CordisPlacement {
	public static void main(String[] args) {
		System.out.println("Enter the number to test");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int num = 5, n = 0, h = 0, temp, pow;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String result = "";
		while (n == 0) {
			int j = 1;
			while (h == 0) {
				pow = (int) Math.pow(num, j);
				if (val == 1) {
					result = "Passed";
					h = 1;
					n = 1;
				} else if (val > 1 && val < 5) {
					result = "Failed";
					h = 1;
					n = 1;
				} else if (val <= pow) {
					if (val == pow) {
						for (int i = 0; i < arr.size(); i++) {
							temp = 1;
							if (temp == arr.get(i)) {
								result = "Failed";
								h = 1;
								n = 1;
								break;
							} else {
								result = "Passed";
								h = 1;
								n = 1;
							}
						}
					}
					int x = j - 1;
					for (int i = 0; i < arr.size(); i++) {
						temp = arr.get(i);
						if (x == temp) {
							result = "Failed";
							h = 1;
							n = 1;
							break;
						}
					}
					arr.add(x);
					val = val - ((int) Math.pow(num, x));
					break;
				}
				j++;
			}
		}
		System.out.println(result);
	}
}
