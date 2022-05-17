package interviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintNosNotInRange {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(2000);
		li.add(500);
		li.add(3000);
		li.add(3200);
		li.add(1500);
		
		for (Integer i : li) {
			if (i<1000 || i>3000) {
				System.out.println(i);
			}
		}
	}
}
