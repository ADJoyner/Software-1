import java.util.Scanner;

public class Main {
public static void main(String[] args) {
     
 Scanner ask = new Scanner(System.in);

System.out.println("Problem 2");
System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint
int input = ask.nextInt(); //this is gonna go in main
        //Print factorial(input)

System.out.println(factorial(input));

 
System.out.println("Problem 3");
System.out.println("Enter a number and I will tell you the sum of every other number: ");
int U_num = ask.nextInt();
System.out.println(OtherDigt(U_num));


System.out.println("Problem 5");
System.out.println("Enter a string pls");
String word = ask.nextLine();

 System.out.println("The reverse is: " + rev(word));     
}










/* 
    System.out.println("Enter your first number to be added");
    int firstInput = ask.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = ask.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
      
    }

  
    public static int add(int zyx, int tuv){
        return(zyx + tuv);
    }

    public static void printDog(){
        System.out.println("Dog");        
        */

public static int factorial(int input){
        int sum = 1;

        for (int i = 2; i <= input; i++){
            sum *= i; 
        }
        return(sum);                   
}


public static int OtherDigt(int U_num){
        int num = 0;

        for (int i = 1; i <= U_num ; i+=2)
        {
           num+=i;
           // Digit Check Below:
            System.out.println(i + ",");
        }
        System.out.println("The sum of every other digit: " + num);
        return(num);
}

public static String rev(String word){
  String reverse = "";

for (int w = 0; w < word.length(); w++){
        reverse = word.charAt(w) + reverse; 
}
return(reverse);
}

        
        
        
        
        
        
}
