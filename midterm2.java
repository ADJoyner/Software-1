import java.util.Scanner;

public class midterm_copy2 {
public static void main(String[] args) throws Exception {

Scanner Q = new Scanner(System.in); //naming scanner 'Q" like quiz cuz it'll be easy for me to remember/type
boolean answer = false; 

        System.out.println("Welcome to Aiden's Atrocious Abberations: The Quiz!");
        System.out.println("I hope you're ready for some ridicilous, and questionably fair, questions");
        System.out.println();
        
        //format for question methods --> QuestionsX(insert user inputted parameters here);
        System.out.println("Let's start off easy, shall we?");
        System.out.println("What is...the capital of Philippines?");
int fails = 0; //will iterate each time it's not the right answer

while (answer == false){
String q1 = Q.nextLine();

        if (q1 == "Manila"){
            // Print correct
            answer = true;
            System.out.println("Correct!");

        } else if (q1 == "manila"){
            // hehe you didn't capitalize the proper noun
            System.out.println("Proper noun pls");
            answer = false;
            fails++;
            //repeat time?
         
        } else {
            //repeat 
            // put funnier response later
            System.out.println("Try Again");
            answer = false;
            System.out.println("poopad");

            fails++;
        }
    }

System.out.println("the end");

}
}
