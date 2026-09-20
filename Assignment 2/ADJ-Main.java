//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class Main {
    public static void main(String[] args) {

 Scanner user = new Scanner(System.in);

 Integer score = 0;
 String answer = user.NextString();

System.out.println("Welcome to my fixation-inspired Supergiant Games Games Quiz!");
System.out.println("Question 1:");
System.out.println("In Hades (2020), what is the name of the protagnist?");

if (answer == "Zagreus"){

System.out.println("Correct!");
score = score + 1;

} else if (answer == "Hades" || answer == "hades") {

System.out.println("You got baited! (sorry not sorry)");
} else {

System.out.println("Incorrect :p");
}

///////////////////////////////////////////
System.out.println("Question 2:");
System.out.println("In Pyre (2017), how many playable characters do you have access to by the end of the Story Mode?");

if (answer == "8" || answer == "Eight" || answer == "eight"){

System.out.println("Correct!");
score = score + 1;

} else if (answer == "21" || answer == "Twenty one" || answer == "twenty one") {

System.out.println("Either you were thinking of the number of playable characters in the Versus Mode...or you're here cuz you got a lucky guess lol");
} else {
System.out.println("Incorrect :p");
}

///////////////////////////////////////////
System.out.println("Question 3:");
System.out.println("Who is the voice actor for 'Red' in Transistor (2014)");
System.out.println("Pro Tip: She's a lead singer in ALL of the other Supergiant Games titles");

if (answer == "Ashley Barrett"){

System.out.println("Correct!");
score = score + 1;

} else if (answer == "ashley barrett" || answer == "Ashley barrett" || answer == "ashley Barrett") {
System.out.println("yes im being a stickler about caps");

} else if (answer == "Ashley" || answer == "ashley") {
System.out.println("full name please");

} else {
System.out.println("Incorrect :p");
}

///////////////////////////////////////////
System.out.println("You've made it to the end!");

if (score = 3) {
System.out.println("Congrats, a perfect score :D");
System.out.println("I wonder if you truly knew the answer or had to look up everything...");

 
} else if (score > 3) {
System.out.println("how tf did you get extra points?? :p");

} else if (score = 2) {
System.out.println("2/3, ooo nice work");

} else if (score = 1) {
System.out.println("1/3, not too bad");

} else if (score = 0) {
System.out.println("ummm...im sure you tried your best");

} else {
System.out.println("hiya! welcome to the backrooms >:)");

}

    }
}


