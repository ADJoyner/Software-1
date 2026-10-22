import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class midterm_copy2 {
public static void main(String[] args) throws Exception {

Scanner Q = new Scanner(System.in); //naming scanner 'Q" like quiz cuz it'll be easy for me to remember/type
boolean answer = false; 


 //initally had it all typed out but since i can't get the input to work outside of main,
 //im "narrator" text in their own methods for organization sake
 Intro(); 

//will iterate each time it's not the right answer according to the questions
int q1_fails = 0;
int q2_fails = 0;
int q3_fails = 0;
int q4_fails = 0;
int q5_fails = 0;
int q6_fails = 0;

int T_fails = q1_fails + q2_fails + q3_fails + q4_fails + q5_fails + q6_fails; 



//Question1()
        System.out.println("Let's start off easy, shall we?");
        System.out.println("What is...the capital of Philippines?");


while (answer == false){
String q1 = Q.nextLine();
//RAHHHHHH I FORGOT .EQUALS() IS FOR STRINGS
        if (q1.equals("Manila")){
            // Print correct
            answer = true;
            System.out.println("Correct!");

        } else if (q1.equals("manila")){
            // hehe you didn't capitalize the proper noun
            System.out.println("Proper noun pls");
            answer = false; //tbh ik that i don't have to manually set it to false again each time, but it's more of a failsafe
            q1_fails++;
            //repeat time?
         
        } else {
            //repeat 
            // put funnier response later
            System.out.println("Try Again");
            answer = false;
            q1_fails++;
        }
    }

//System.out.println("the end");
answer = false; //gotta reset for new loop

//Question2()
        System.out.println("Solve this equation:");
        System.out.println("(4*2) 6 + 7 - 2 / 2");


while (answer == false){
String q2 = Q.nextLine();
//RAHHHHHH I FORGOT .EQUALS() IS FOR STRINGS
        if (q2.equals("53") || q2.equals("fifty three") || q2.equals("fifty-three") || q2.equals("Fifty-three") || q2.equals("Fifty three")){
            // Print correct
            answer = true;
            System.out.println("Correct!");

        } else if (q2.equals("96")){
            // hehe you didn't capitalize the proper noun
            System.out.println("Please eat my dear aunt sally :)");
            answer = false; 
            q2_fails++;
            //repeat time?
         
        } else {
            //repeat 
            System.out.println("Try Again");
            answer = false;
            q2_fails++;
        }
    }

answer = false; //gotta reset for new loop


//Question3()
System.out.println("I'm feeling generous, so here's a multiple choice!");
System.out.println("What is my favorite color?");
System.out.println("A = Purple | B = Black | C = Blue | D = None cuz I'm not racist");


while (answer == false){
String q3 = Q.nextLine();
    if (q3.equals("A") || q3.equals("a")){
    System.out.println("Try Again");
        answer = false;
        q3_fails++;
    } else if (q3.equals("B") || q3.equals("b")){
        System.out.println("Try Again");
        answer = false;
        q3_fails++;
    } else if (q3.equals("C") || q3.equals("c")) {
        System.out.println("Correct!");
        answer = true;
        
    } else if (q3.equals("D") || q3.equals("d")) {
        System.out.println("I appreciate your faith in me, but try again");
        answer = false;
        q3_fails++;
    } else if (q3.equals("or") || q3.equals("Or")){
     System.out.println("Yknow what smartass, I'll give it to you.");   
    answer = true;
    }
    
    else {
     System.out.println("you've really only got 4 options sooooo please pick em");   
    }

}
answer = false; 

//Question4()
System.out.println("uhhhh ");
System.out.println("4 is a little shy. They'll be back soon enough.");
System.out.println();



//Question5() --> more math
System.out.println("You Vs Math: REMATCH TIME!");
System.out.println("What's the area of a triangle that has a 9in height and 5in base");

while (answer == false){
String q5 = Q.nextLine();
        if (q5.equals("22.5")){
            // Print correct
            answer = true;
            System.out.println("Correct!");

        } else if (q5.equals("Twenty two point five") || q5.equals("twenty two point five")){
            // hehe you didn't capitalize the proper noun
            System.out.println("You freak...  D:");
            System.out.println("You're right but why'd you type it out like that");
            answer = true; 

            //repeat time?
         
        } else {
            //repeat 
            System.out.println("Try Again");
            answer = false;
            q5_fails++;
        }
    }

answer = false; 


//Question6() --> the typo question
System.out.println("Which is NOT a city in Missisippi ");
System.out.println("A = Jackson | B = Greenvile | C = Puris | D = Picaiune");

while (answer == false){
String q6 = Q.nextLine();
    if (q6.equals("A") || q6.equals("a")){
    System.out.println("I'm hoping you noticed that Missisippi isn't a real state. ");
        answer = true;

    } else if (q6.equals("B") || q6.equals("b")){
        System.out.println("Try Again");
        answer = false;
        q6_fails++;
    } else if (q6.equals("C") || q6.equals("c")) {
        System.out.println("Correct!");
        answer = false;
        q6_fails++;
    } else if (q6.equals("D") || q6.equals("d")) {
        System.out.println("I appreciate your faith in me, but try again");
        answer = false;
        q6_fails++;
    } else if (q6_fails >= 10 && !q6.equals("A")){
        System.out.println("Okay I feel bad now. Re-read the question carefully please lol");
    } else if (q6_fails >= 10 && !q6.equals("a")){
        System.out.println("Okay I feel bad now. Re-read the question carefully please lol");
    }
    else {
     System.out.println("We've already been over this...");   
    }
}
//Question7 --> there are no more questions. im bored. bye bye
System.out.println("Last question!");
System.out.println("Ehhh nevermind. I'm bored. You can go.");
System.out.println();
System.out.println("JERRY! CUE THE CREDITS");


Results(T_fails);
int [] failures = {q1_fails, q2_fails, q3_fails, q4_fails, q5_fails, q6_fails}; //i wanted to try and use regular lists but i got fed up

//print array here:
/*
for i (i = 0, i++)
print("Question " + i + ": " + array[i]) 
*/


/* 
if (fails > 0){
    System.out.println("Have you a great day!");
} else if (fails <= 0){
    System.out.println("There's no way you know me that well.");
    System.out.println("You've already done the quiz once, you cheated, or you're one of the luckiest people today...congrats I GUESS :p");
} else {
}
*/

}




//////Methods Below/////
public static void Intro(){
System.out.println("Welcome to Aiden's Atrocious Abberations: The Quiz!");
System.out.println("I hope you're ready for some ridicilous, and questionably fair, questions");
System.out.println();

}

public static Integer Results(int fails){
//i like being a lil silly
System.out.println("You failed :" + fails);
System.out.println("Yeah there's no points. Just a reminder of how your incomptence.");
if (fails > 0){
    System.out.println("Have you a great day!");
} else if (fails <= 0){
    System.out.println("There's no way you know me that well.");
    System.out.println("You've already done the quiz once, you cheated, or you're one of the luckiest people today...congrats I GUESS :p");
} else {

}
return fails;
}








}

