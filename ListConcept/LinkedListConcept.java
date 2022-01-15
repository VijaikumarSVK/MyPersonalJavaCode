package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("world");
		ll.add("earth");
		ll.add("india");
		ll.add("tamilnadu");
		System.out.println(ll.size());

		System.out.println(ll);
		
		//addFirst() 
		ll.addFirst("universe");
		
		//addLast()
		ll.addLast("chennai");
		
		System.out.println(ll);
		
		//get value
		System.out.println(ll.get(3));
		
		//set value
		ll.set(2, "sun");
		System.out.println(ll);
		
		//remove first and last value
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		ll.remove(2);
		System.out.println(ll);
		
		//how to print all the all the values of LinkedList;
		//for loop
		System.out.println("****for loop****");

		for(int i= 0; i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		//advanced fo loop

		System.out.println("****advanced for loop****");
	
		for(String str :ll){
			System.out.println(str);
		}
		//iterator
		System.out.println("***Iterator***");

		Iterator<String>it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//while loop
		System.out.println("***while loop***");
		int s=0;
		while(ll.size()>s){
		System.out.println(ll.get(s));
		s++;
		}
		
	}
}
