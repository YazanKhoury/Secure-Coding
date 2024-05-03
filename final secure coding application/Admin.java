package ProjectUtilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin {
	String password , username ,usertype;
	static Scanner scn = new Scanner(System.in);
	static void creat() throws IOException {
		String adminchoice;
		boolean Try = true ;
		while(Try)
		{
			// what the admin can do
		System.out.println("what do you wna to do");
		System.out.println("1.creat users");
		System.out.println("2.creat exam and question ");
		System.out.println("3.see the exam");
		System.out.println("4.exit");
		adminchoice = scn.next();
		if(adminchoice.equals("1")) {
			String username,password,usertype;
			System.out.println("enter new user");
			username = scn.next();
			System.out.println("enter the password");
			password = scn.next();
			System.out.println("enter the user type");
			usertype=scn.next();
			write(username,password,usertype);			
		}else if (adminchoice.equals("2")) {
			Teacher.create();
		}else if(adminchoice.equals("3")) {
			Student.see();
		}else if(adminchoice.equals("4")) {
			
			break;
			
		}else {
			System.err.println("wrong input");
		}
	}
	}
static void write(String username ,String password , String usertype) throws IOException {
	File f = new File("System.txt");
	if(!f.exists()){
		f.createNewFile();
	}else {
		BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
	    	
	    try {
	        bw.write(username+"\n");
	        bw.write(password+"\n");
	        bw.write(usertype+"\n");
	    } catch(IOException e){
	        System.out.println(e);
	    }finally {
	        bw.close();
	    }
	}

}
}
