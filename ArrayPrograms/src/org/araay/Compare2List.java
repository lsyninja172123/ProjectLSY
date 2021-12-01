package org.araay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare2List {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> m = new ArrayList<>(Arrays.asList(1,2,3,5,4));
		
		System.out.println("List l : "+l);
		System.out.println("List m : "+m);

		boolean equals = Arrays.equals(l.toArray(), m.toArray());
		System.out.println(equals);
		
		if (equals==false) {
			System.out.println("Two list are not same");
		} else {
			System.out.println("Two list are same");
		}
		
		/*List<String> l = new ArrayList<>(Arrays.asList("abc","cbv","qwe"));
		List<String> m = new ArrayList<>(Arrays.asList("abc","qwe","cbv"));
		
		System.out.println("List l : "+l);
		System.out.println("List m : "+m);

		boolean equals = Arrays.equals(l.toArray(), m.toArray());
		System.out.println(equals);
		
		if (equals==false) {
			System.out.println("Two list are not same");
		} else {
			System.out.println("Two list are same");
		}*/
		
	}
}
