package org.araay;

import java.util.ArrayList;
import java.util.List;

public class UserDefineList {

	public static void main(String[] args) {
		
		List<StudentDetails> l = new ArrayList<>();
		StudentDetails s = new StudentDetails();
				
		s.setStuId(123);
		s.setStuname("Priya");
		s.setStuphone(9876543212l);
		s.setAddress("No.1/7, bangaru street, ayanavaram chennai - 600023");
		s.setDob("30/9/1997");
		s.seteMail("priya@gmail.com");
		s.setGender("Female");
		
		StudentDetails s1 = new StudentDetails();
		
		s1.setStuId(345);
		s1.setStuname("Bhuvana");
		s1.setStuphone(9878979212l);
		s1.setAddress("No.5, mettu street, ayanavaram,chennai-600023");
		s1.setDob("3/5/1999");
		s1.seteMail("bhuvana@gmail.com");
		s1.setGender("Female");
		
		l.add(s);
		l.add(s1);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println("---------------------------------------------------");
			System.out.println("Values are given below :");
			System.out.println();
			System.out.println("Student ID : "+l.get(i).getStuId());
			System.out.println("Student name : "+l.get(i).getStuname());
			System.out.println("Student phone no : "+l.get(i).getStuphone());
			System.out.println("Student address : "+l.get(i).getAddress());
			System.out.println("Student DOB : "+l.get(i).getDob());
			System.out.println("Student email : "+l.get(i).geteMail());
			System.out.println("Student gender : "+l.get(i).getGender());
			System.out.println("---------------------------------------------------");
		}
		for (StudentDetails x : l) {
			System.out.println("---------------------------------------------------");
			System.out.println("Values are given below :");
			System.out.println();
			System.out.println("Student ID : "+x.getStuId());
			System.out.println("Student name : "+x.getStuname());
			System.out.println("Student phone no : "+x.getStuphone());
			System.out.println("Student address : "+x.getAddress());
			System.out.println("Student DOB : "+x.getDob());
			System.out.println("Student email : "+x.geteMail());
			System.out.println("Student gender : "+x.getGender());
			System.out.println("---------------------------------------------------");

		}
		
		
	}
}
