package org.araay;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		
		
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> m = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(5);
		
		System.out.println(l);
		System.out.println(m);
		boolean b = l.contains(3);
		System.out.println(b);
		int indexOf = l.indexOf(6);
		System.out.println(indexOf);
		/*Integer remove = l.remove(2);
		System.out.println(l);
		int indexOf1 = l.indexOf(4);
		System.out.println(indexOf1);*/
		l.add(2, 100);
		System.out.println( l);
		/*l.set(2, 1000);
		System.out.println(l);*/
		
		/*System.out.println(l);
		System.out.println(m);
		l.addAll(m);
		System.out.println(l);
		m.removeAll(l);
		System.out.println(m);
		l.retainAll(m);
		System.out.println(l);*/
	}
}
