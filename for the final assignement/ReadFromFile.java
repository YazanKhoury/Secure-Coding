
package ProjectUtilities;
//the needed libraries
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFromFile {

    
    public static void main(String[] args) throws IOException {
    //specify the name of the file if the file is within 
    //the same folder of the project
    String fileName = "SafaaTry.txt";
    
    //create the BufferReader to start reading the content of the file
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    
    
    try {
        String line;
        //reading the file line by line
        while ((line = br.readLine()) != null) {
           //the line variable contains the content of the current line
           System.out.println(line);
        }
    } catch(IOException e){
        System.out.println(e);
    }finally {
        //close the file
        br.close();
    }
    }
    
}
