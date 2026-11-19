import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("src/text.txt");
        //need to do previous_folder/ in VS Code
        String line = "";
        String name = "";

        try{
           PrintWriter write = new PrintWriter(new FileWriter("text.txt", true));
            writer.write("Aiden Joyner");
            writer.close;
            
            /*
            Scanner input = new Scanner(inputFile); 
            while(input.hasNext()){
                line = input.nextLine();
                
               //System.out.println(line);
                */
            }
       
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("My name is " + line); 
    }
}
