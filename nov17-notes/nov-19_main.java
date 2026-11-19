import java.io.*;
import java.util.Scanner;
import java.util.*;

public class nov-19_main {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("src/text.txt");
        //need to do previous_folder/ in VS Code
        List<String> list = new ArrayList<String>();
        String name = "";

        try{
           
            Scanner input = new Scanner(inputFile); 
            while(input.hasNext()){
                list.add(input.NextLine());
                
               //System.out.println(line);
                
            }
       
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(list); 
    }
}
