package AdvanceJavaProgramming;

import java.util.*;

public class Test8 {

	public static void main(String args[]) {

		LinkedList<String> llone = new LinkedList<String>();
		LinkedList<String> lltwo = new LinkedList<String>();

		llone.add("A");
		llone.add("B");
		llone.add("C");
		llone.add("D");
		llone.add("E");
		llone.add("F");
		llone.add("G");
		llone.add("H");
		llone.add("I");
		llone.add("J");

		System.out.println("The linked list added first: " + llone);

		int times = llone.size() - 1;

		for (int i = times; i >= 0; i--) {
			String push = llone.get(i);
			lltwo.add(push);
		}
		System.out.println("The linked list after reversal: " + lltwo);

	}
}
