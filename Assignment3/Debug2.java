import java.util.Scanner;

public class Debug2 {
public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
 
        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
 

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)

        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint
        int input = ask.nextInt();
        int sum = 1;

        for (int i = 2; i <= input; i++){
            sum *= i; 
            ///sum = sum * i
            /// 6*4
            /// 2*3
            /// 1*2
            /// loop doesn't start cuz 1 is less than 2
            /// im annoyed that i had to look this up...
/// 6 = 3 * 2 * 1
        }
        System.out.println(sum);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?

        int U_num = ask.nextInt();
        int num = 0;

        /// modulo on counter?
        for (int i = 1; i <= U_num ; i+=2)
        {
           num+=i;
           // Digit Check Below:
            System.out.println(+ i);
            
        }
        System.out.println("The sum of every other digit: " + num);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }
         System.out.println("it's joever...");

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("Enter a string pls");

        String word = ask.nextLine();
        System.out.println("You wrote: " + word);

        //hint
        String reverse = "";
///i really didn't want to have to search this up but i genuinely
/// forgot the method for pull the indexes of each character >:(
        for (int w = 0; w < word.length(); w++){
            reverse = word.charAt(w) + reverse; 
        }
        System.out.println("The reverse is:" + reverse);

        //side note: this works in isolation but won't when everything runs at once
    }
}
