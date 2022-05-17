package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VaccinationAllocation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the center count");
	int noOfCenters = sc.nextInt();
	Map<String,Integer> mp=new HashMap<>();
	int distance[][] = new int[noOfCenters][2];
	System.out.println("Enter the location");
	for (int i = 0; i < noOfCenters; i++) {
		for (int j = 0; j < 2; j++) {

			distance[i][j] = sc.nextInt();
		}
	}
	 
	
	System.out.println("enter the no of people");
	int noOfPersons = sc.nextInt();
	System.out.println("Enter the data");
	
	List<String> persons=new ArrayList<>();
	Scanner sc1=new Scanner(System.in);
	for (int i = 0; i < noOfPersons; i++) {
		persons.add(sc1.nextLine());
	}
	System.out.println("datas "+persons);
	
	for (int i = 0; i < persons.size() ;i++) {
		String str = persons.get(i);
		String[] split = str.split(" ");
		String s = (split[split.length-1]);
		int langti = Integer.parseInt(s);
		System.out.println("langtitude"+langti);
		List<Integer> li=new ArrayList<>();
		for (int j = 0; j < distance.length; j++) {
			int centerlang = distance[j][1];
			int diff=centerlang-langti;
			
		}
		System.out.println("difference list"+li);
		Integer min = Collections.min(li);
		System.out.println("Minimum"+min);
		int index = li.indexOf(min);
		mp.put(split[0], index+1);		
	}
	
	System.out.println(mp);
	
	
	
	
	
}
}
