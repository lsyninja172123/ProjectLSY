package org.araay;

import java.util.LinkedList;
import java.util.List;

public class LinkedListValue {

	public static void main(String[] args) {
		
		List l=new LinkedList<>();
		List m=new LinkedList<>();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		l.add(400);
		l.add(700);
		
		int s = l.size();
		System.out.println(l);
		System.out.println(s);
		Object rem = l.remove(2);
		System.out.println("Removed value is : "+rem);
		System.out.println(l);
		System.out.println();
		Object get = l.get(2);
		System.out.println("Value in index position 2 is : "+get);
		System.out.println(l);
		System.out.println();
		//index based add
		l.add(2, 1000);
		System.out.println("After insertion : ");
		System.out.println(l);
		System.out.println();
		//to replace
		Object set = l.set(2, 2000);
		System.out.println("After replacing : ");
		System.out.println(l);
		System.out.println();
		boolean contains = l.contains(300);
		System.out.println(contains);
		int indexOf = l.indexOf(400);
		System.out.println("Index position of 400 is : "+indexOf);
		int lastIndexOf = l.lastIndexOf(400);
		System.out.println("Last index position of 400 is : "+lastIndexOf);
		l.clear();
		System.out.println(l);
		boolean empty = l.isEmpty();
		System.out.println("To check list is empty or not? "+empty);
	
	}
}
