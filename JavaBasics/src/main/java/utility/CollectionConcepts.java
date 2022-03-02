package utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionConcepts {
	public static void main(String[] args) {
      Integer a[]= {3,4,5,6};
      
      List<Integer> li=new ArrayList<Integer>();
      
      li.addAll(Arrays.asList(a));
      
      System.out.println(li);
      
	}
}
