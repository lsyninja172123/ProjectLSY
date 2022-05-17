package interviewPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOfWordsInNotepad {
public static void main(String[] args) throws IOException {
	String s="C:\\Users\\live\\Desktop\\fileread.txt";
	
	FileReader fr=new FileReader(s);
	BufferedReader reader=new BufferedReader(fr);
	String line="";
	int n=0;
	while ((line=reader.readLine())!=null) {
		System.out.println(line);
		String[] words = line.split(" ");
		n=n+words.length;
	}
	System.out.println(n);
}
}
