package ProjectUtilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		String userName , password , userType;
		System.out.println("Enter the UserName password!");
		userName = scn.next();
		password=scn.next();
		userType = login(userName,password);
		if(userType == "n") {
			System.out.println("wrong username or password! Try again :) ");
		}else{
			mainn(userType);
		}

	}
static String login(String username , String password) throws IOException {
		
	
	String fileName = "System.txt";

	BufferedReader br = new BufferedReader(new FileReader(fileName));
	
	try {
		String line;
		while ((line = br.readLine()) != null) {
			if(line.equals(username)){
				 line = br.readLine();
				if(line.equals(password)){
					String	userType = br.readLine();
					return userType ; 
				}
			}
		}
	} catch(IOException e){
		System.out.println(e);
	}finally {
		br.close();
	}
	return "n" ;
}
static void mainn(String usertype) throws IOException
{
	System.out.println("Hello Dear "+usertype);
	if(usertype.equals("admin")) {
		Admin user = new Admin();
		Admin.creat();
		
	}else if(usertype.equals("teacher")){
		Teacher user = new Teacher();
		Teacher.create();
	}else if(usertype.equals("student")) {
		Student user = new Student();
		Student.see();
	}
}
}
