package ProjectUtilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Student {
String examname ;
static Scanner scn = new Scanner(System.in);
	static void see() throws IOException {
		System.out.println("Hello Dear Student! ");
		System.out.println("The only option you have is to view your exam");
		System.out.println("which exame do you want to view?");
		String examname = scn.next();
		reader(examname);
}
static void reader(String examname) throws IOException {
	 String fileName = examname+".txt";
	    
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    
	    try {
	        String line;
	        while ((line = br.readLine()) != null) {
	        	System.out.println(line);
	        }
	    } catch(IOException e){
	        System.out.println(e);
	    }finally {
	        br.close();
	    }
}
}
