import java.util.Scanner;

public class unique_function {
public static void main(String[] args) {
Scanner GT = new Scanner(System.in); //naming scanner 'Q" like quiz cuz it'll be easy for me to remember/type

System.out.println("What is your gamer tag/IGN (in-game username)?");
String IGN = GT.nextLine();

System.out.println("Enter the 4 digits of your tag");
String Tag = GT.nextLine();

GamerTag(IGN, Tag);
}


//reason for a function
public static void GamerTag(String ign, String tag){
System.out.println("Here is your gamer tag: " +  ign + "#" + tag);
}

}
