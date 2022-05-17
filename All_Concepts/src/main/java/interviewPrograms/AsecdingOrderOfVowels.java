package interviewPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class AsecdingOrderOfVowels {
public static void main(String[] args) {
	String s="missing alphabuet";
	String vowel="aeiou";
	Map<Character, Integer> mp=new HashMap<>();
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (vowel.contains(String.valueOf(c))) {
			if (mp.containsKey(c)==false) {
				mp.put(c, 1);
			}
			else {
				Integer it = mp.get(c);
				mp.put(c, it+1);
			}
		}
	}
	System.out.println(mp);
	
	
	List<Character> li = new ArrayList<>();
	Collection<Integer> values = mp.values();
	Set<Entry<Character, Integer>> entry = mp.entrySet();

	int count = 0;//2
	int a=(int)'z';//127
	
	int index=0;//1,2
	for (Entry<Character, Integer> entry2 : entry) {
		Character c = entry2.getKey();
		int temp=(int)c;//97,117,101
		if (entry2.getValue()>count) { //2>0 1>2 1>2
			count=entry2.getValue();//
			li.add(0, c);//0,a
			
		}
		else if (entry2.getValue()==count) {// 1==2 1==2
			if (a>temp) {
				a=temp;
				li.add(index-1,c);
			}
			else { 
				li.add(c);
			}
		}
		else {
			li.add(c);
		}
		index++;//1,2
		
		}
	System.out.println(li);
	}
	 	
}

