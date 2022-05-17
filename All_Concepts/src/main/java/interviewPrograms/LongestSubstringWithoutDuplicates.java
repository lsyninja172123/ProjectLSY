package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubstringWithoutDuplicates {
public static void main(String[] args) {
	String s ="the longest substring";
	s=s.replaceAll(" ", "");
	String sub="";
	List<String> li=new ArrayList<>();
	List<Integer> wordSize=new ArrayList<>();
	for (int i = 0; i <s.length(); i++) {
		char c = s.charAt(i);
		String temp=String.valueOf(c);
		for (int j = i+1; j <s.length(); j++) {
			char c1 = s.charAt(j);
			if (temp.contains(String.valueOf(c1))==false) {
				temp=temp+c1;
			}
			else {
				break;
			}
		}
		li.add(temp);
	}
	System.out.println(li);
	/*
	 * for (String word : li) { wordSize.add(word.length()); } Integer max =
	 * Collections.max(wordSize); for (String word : li) { if (word.length()==max) {
	 * System.out.println(word); } }
	 */
	int max = Integer.MIN_VALUE;
	for (String word : li) {
		
		int l = word.length();
		if(max<l)
			max=l;
		}
	for (String word : li) {
		if(word.length()==max) {
			System.out.println(word);
		}
	}
	}

	
}

