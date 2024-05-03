package ProjectUtilities;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Teacher
{
		String examname , question ;
		static void create () throws IOException
		{
			Scanner Scan = new Scanner(System.in);
			String yesOrNO ;
			boolean tryAgin = true ;
			while(tryAgin) {
				System.out.println("what is the name of the exame?");
				String examName = Scan.nextLine();
				Scan.nextLine();
				System.out.println("enter the qusetion");
				String question = Scan.nextLine();
				System.out.println("enter the 1st choice");
				String firstChoice = Scan.nextLine();
				System.out.println("enter the 2nd choice");
				String secondChice = Scan.nextLine();
				System.out.println("enter the 3rd choice");
				String thirdChoice = Scan.nextLine();
				Writer(examName,question,firstChoice,secondChice,thirdChoice);
				System.out.println("do you want to add another exam or qusetion?");
				yesOrNO = Scan.nextLine();
					if(yesOrNO.equals("no")) {
						tryAgin = false ;
						break ;
					}else if (yesOrNO.equals("yes")) {
						break;
					}else {
						System.err.println("wrong input! Try again :)");
					}
			}
			}
		static void Writer(String examname , String question , String a ,String b,String c) throws IOException {
			File f = new File(examname+".txt");
			if(!f.exists()){
				f.createNewFile();
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
			try {
				
				bw.write(question+"\n");
				bw.write(a+"\n");
				bw.write(b+"\n");
				bw.write(c+"\n");
		
			} catch (Exception e) {
				System.out.println("e");
			
			}finally 
			{
				bw.close();
			}
		
		}
}


