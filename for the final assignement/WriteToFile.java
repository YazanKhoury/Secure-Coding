
package ProjectUtilities;
//import the needed libraries
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        //create file object
        File f = new File("Exam1.txt");
        
        //if the file does not exist then create new one
        if(!f.exists()){
            f.createNewFile();
        }
        
        //create the BufferedWriter to start writing to the file
        //the file opend with the append mode
        //if you don't want the append mode then eliminate the "true" part
        BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
        
        
        try{
            //write what you want to the file
            bw.write("Safaa Hriez.");
            
        }catch(IOException e){
            System.out.println("e");
        }finally{
            
            //close the connection with the file
            bw.close();
        }
    }
}
