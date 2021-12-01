package org.araay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class DuplicatesArray {

	public static void main(String[] args) {
		
		List<String> l = new Vector<>();
		Set<Integer> s = new HashSet<>();
		
		l.add("Java");
		l.add("Oracle");
		l.add("Core Java");
		l.add("Advanced Java");
		l.add("Python");
		l.add("Selenium");
		l.add("Framework");
		l.add("Methods");
		l.add("Class");
		
		System.out.println( "List l is ");
		System.out.println(l);
		
		String[] a=new String[l.size()];
		a = l.toArray(a);
		System.out.println(a);
		for (String string : a) {
			System.out.println(string);
		}
		
		
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(50);
		s.add(60);
		s.add(80);
		s.add(60);
		s.add(50);
		
		System.out.println( "Set s is ");
		System.out.println(s);
		System.out.println( "Size of Set s is "+s.size());
		System.out.println();
		
		for (Integer x : s) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("List l is ");
		System.out.println(l);
		System.out.println("Size of List l is "+l.size());
		System.out.println();
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
		/*s.addAll(l);
		System.out.println("After adding list l into set s :");
		System.out.println(s);
		System.out.println();
		System.out.println("Duplicates count is ");
		System.out.println(l.size()-s.size());*/
		System.out.println();
		
		int i = l.indexOf("Advanced Java");
		int li = l.lastIndexOf("Oracle");
		System.out.println("Index position of 10 is "+i);
		System.out.println("Last index position of 10 is "+li);
		System.out.println();
		
		List<String> subList = l.subList(2, 7);
		System.out.println( "Sub index is "+subList);
		
		
	}
}
