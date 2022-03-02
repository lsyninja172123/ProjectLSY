package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doubt {
	static double f = 1.234562334567873;
	static String s="sdfhgfdsaf!@#$%^&*";
	static String s1=null;
	public static void demo() {
		final int x = 10;
	}

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); float nextFloat = sc.nextFloat();
		 * System.out.println(nextFloat);
		 */
		System.out.println(f);
		System.out.println(s.substring(1, 3));
		//System.out.println(s.replaceAll("[\\w]",""));
		System.out.println(s.replaceAll("[A-Za-z0-9]", ""));
		List li=new ArrayList<>();
		li.add(1);
		li.add("asdf");
		//System.out.println(li.get(5));
		System.out.println(li);
		//System.out.println(s1.split(" "));
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

}
