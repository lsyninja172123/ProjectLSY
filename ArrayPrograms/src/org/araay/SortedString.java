package org.araay;

import java.util.Scanner;

public class SortedString {

	public static void main(String[] args) {
		
		String temp;
		String names[] = new String[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the names");
		for (int i = 0; i < names.length; i++) {
			names[i] = s.nextLine();
		}
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].compareTo(names[j])>0) {
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted Strings are :");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
