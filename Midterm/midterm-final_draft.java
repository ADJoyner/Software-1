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

int T_fails = 0; 



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
        System.out.println("\nSolve this equation:");
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
System.out.println("\nI'm feeling generous, so here's a multiple choice!");
System.out.println("What is my favorite color?");
System.out.println("A = Purple, B = Black, C = Blue, or D = None cuz I'm not racist");


while (answer == false){
String q3 = Q.nextLine();
    if (q3.equalsIgnoreCase("A")){
    System.out.println("Try Again");
        answer = false;
        q3_fails++;
    } else if (q3.equalsIgnoreCase("B")){
        System.out.println("Try Again");
        answer = false;
        q3_fails++;
    } else if (q3.equalsIgnoreCase("C")) {
        System.out.println("Correct!");
        answer = true;
        
    } else if (q3.equalsIgnoreCase("D")) {
        System.out.println("I appreciate your faith in me, but try again");
        answer = false;
        q3_fails++;
    } else if (q3.equalsIgnoreCase("or")){
     System.out.println("Yknow what smartass, I'll give it to you.");   
    answer = true;
    }
    
    else {
     System.out.println("you've really only got 4 options sooooo please pick em");   
    }

}
answer = false; 

//Question4()
System.out.println("\nuhhhh ");
System.out.println("4 is a little shy. They'll be back soon enough.");


//Question5() --> more math
System.out.println("\nYou Vs Math: REMATCH TIME!");
System.out.println("What's the area of a triangle that has a 9in height and 5in base");

while (answer == false){
String q5 = Q.nextLine();
        if (q5.equalsIgnoreCase("22.5in") || q5.equalsIgnoreCase("22.5 in") || q5.equalsIgnoreCase("22.5 inches")){
            // Print correct
            answer = true;
            System.out.println("Correct!");

        } else if (q5.equalsIgnoreCase("Twenty two point five inches")){
            // hehe you didn't capitalize the proper noun
            System.out.println("You freak...  D:");
            System.out.println("You're right but why'd you type it out like that");
            
            answer = true; 
         
        } else if (q5.equalsIgnoreCase("Twenty two point five")){
            // hehe you didn't capitalize the proper noun
            System.out.println("You freak...  D:");
            System.out.println("You forgot inches, but I'll let you slide since you bothered typing it out T-T");
            
            answer = true; 
        
        }else if (q5.equals("22.5")){
            System.out.println("errmmm you can't measure in non-existents units 0_o -<d ");
            answer = false;
            q5_fails++;

        } else {
            //repeat 
            System.out.println("Try Again");
            answer = false;
            q5_fails++;
        }
    }
answer = false; 


//Question6() --> the typo question
System.out.println("\nWhich is NOT a city in Missisippi ");
System.out.println("A = Jackson | B = Greenvile | C = Puris | D = Picaiune");

while (answer == false){
String q6 = Q.nextLine();
    if (q6.equalsIgnoreCase("A")){
    System.out.println("I'm hoping you noticed that ''Missisippi'' isn't a real state. ");
        answer = true;

    } else if (q6.equalsIgnoreCase("B")){
        System.out.println("Try Again");
        answer = false;
        q6_fails++;
    } else if (q6.equalsIgnoreCase("C")) {
        System.out.println("Try again");
        answer = false;
        q6_fails++;
    } else if (q6.equalsIgnoreCase("D")) {
        System.out.println("Try again");
        answer = false;
        q6_fails++;
    } else if (q6_fails >= 2 && !q6.equalsIgnoreCase("A")){
        System.out.println("Okay I feel bad now. Re-read the question carefully please lol");
    } else if (q6_fails >= 2 && !q6.equalsIgnoreCase("a")){
        System.out.println("Okay, I feel bad now. Re-read the question carefully please lol");
    }
    else {
     System.out.println("We've already been over this...");   
    }
}

answer = false; 

DialogueBreak(); //haha, finally found a use for methods in containing repetitive code

//Question7 --> there are no more questions. im bored. bye bye
FakeOut();
DialogueBreak();

//Question4 fr
System.out.println("Welp, my boredom can wait. 4 wants you to answer their question before you leave.");
System.out.println("You ready? I sure hope so!");
System.out.println("\nAmong the member in the popular K-pop group ATEEZ, who is my bias?");
System.out.println("Hint: They are Korean :)");


while (answer == false){
String q4 = Q.nextLine();
//RAHHHHHH I FORGOT .EQUALS() IS FOR STRINGS - past aiden
        if (q4.equals("San") || q4.equals("Choi San")){
            answer = true;
            System.out.println("Correct!");

        } else if (q4_fails == 0 && q4.equals("san") || q4.equals("choi san")){
            // hehe you didn't capitalize the proper noun
            System.out.println("yo...this lesson was in the 1st question");
            answer = false; 
            q4_fails++;
         
        } else if (q4.equalsIgnoreCase("Yeosang") || q4.equalsIgnoreCase("Kang Yeo-sang")){
            // hehe you didn't capitalize the proper noun
            System.out.println("oooo you're close. he's my 2nd favorite.");
            answer = false; 
            q4_fails++;
        
        } else if (q4_fails == 1 && q4.equalsIgnoreCase("san") || q4.equalsIgnoreCase("choi san")){
            // hehe you didn't capitalize the proper noun
            System.out.println("Dear god...WE HAVE BEEN OVER THIS");
            answer = false; 
            q4_fails++;
        
        } else if (q4_fails == 2 && q4.equalsIgnoreCase("san") || q4.equalsIgnoreCase("choi san")){
        //i couldn't find a way to get this to respond how i was hoping no matter the order the player entered their answer
        //but it's not that deep rn so i'm just gonna leave it. 
            System.out.println("That's it >:( \nI'm not talking to you any more");
            answer = false; 
            q4_fails++;
            
        } else if (q4_fails > 3) {
            System.out.println("...");
            answer = false;
            q4_fails++;
        
        } else {
            System.out.println("Different idol pls");
            answer = false;
            q4_fails++;
        }
    }

DialogueBreak();

T_fails = q1_fails + q2_fails + q3_fails + q4_fails + q5_fails + q6_fails;
Results(T_fails);
int [] failures = {q1_fails, q2_fails, q3_fails, q4_fails, q5_fails, q6_fails}; //i wanted to try and use regular lists but i got fed up

DialogueBreak();
System.out.println("Fiiine. Here's your breakdown. Now get out please: "); 

//print array here:
int fail_num = 1; //yes i did it manually. i prob could've just did failures.length+1 but i didn't feel like messing with it

for (int i = 0; i < failures.length; i++){
System.out.println("Question " + fail_num + ": " + failures[i]); 
fail_num++;
}


///this is where the game ends :)
}




//////Methods Below/////
public static void Intro(){
System.out.println();
System.out.println("Welcome to Aiden's Atrocious Abberations: The Quiz!");
System.out.println("I hope you're ready for some ridicilous, and questionably fair, questions");
System.out.println();

}

public static Integer Results(int fails){
//i like being a lil silly
System.out.println("\nYou failed: " + fails + " times");
System.out.println("Yeah there's no points. Just a reminder of your incomptence.");
if (fails > 0){
    System.out.println("Have you a great day!");
} else if (fails <= 0){
    System.out.println("There's no way you know me that well.");
    System.out.println("You've already done the quiz once, you cheated, or you're one of the luckiest people today...congrats I GUESS :p");
} else {

}
return fails;
}

public static void FakeOut(){ //trying to organize dialogue using methods
System.out.println("\nLast question!");
//in full honestly, im only now remembering that \n exists to make all this text in one print method...but im not in the mood to change it all :|
System.out.println("Ehhh nevermind. I'm bored. You can go.");
System.out.println();
System.out.println("JERRY! CUE THE CRED-");
//System.out.println("*Insert fanfare here :D*");
System.out.println();
System.out.println("...");
System.out.println("What's that?");
System.out.println("4 is ready to come out for their question?");
System.out.println("Okay... Alright, thanks.");
}

public static void DialogueBreak(){ 
//omg i finally used my brain and realized that i had to make a NEW scanner inside the function
//if i end up remaking this project, imma properly put the inputs in their own functions like i originally intended
Scanner DB = new Scanner(System.in);
System.out.println("\n*Enter to proceed*");
DB.nextLine();

}




}

