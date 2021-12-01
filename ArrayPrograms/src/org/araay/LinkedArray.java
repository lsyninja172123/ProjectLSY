package org.araay;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedArray {

public static void main(String[] args) {
		
		List l=new Vector<>();
		List m=new Vector<>();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		l.add(400);
		l.add(700);
		System.out.println(l);
		System.out.println();
		System.out.println("Befor copying :");
		System.out.println(m);
		System.out.println();
		m.addAll(l);
		System.out.println("Copy list l into list m : ");
		System.out.println(m);
		System.out.println();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(100);
		l.add(600);
		l.add(800);
		System.out.println("Now list l :");
		System.out.println(l);
		System.out.println();
		System.out.println("Now list m is :");
		System.out.println(m);
		System.out.println();
		m.removeAll(l);
		System.out.println("After removing list l values in list m :");
		System.out.println(m);
		System.out.println();
		boolean retainAll = m.retainAll(l);
		System.out.println(retainAll);
		System.out.println();
		System.out.println("After comparing two list : ");
		System.out.println(m);
		
}
}
