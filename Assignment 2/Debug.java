
public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else{
            System.out.println("Var1 is NOT 4");
        }
// could also have left the "less than 4" by changing to an else if
// then finishing w/ vague else print

        int var2 = 6;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else if (var2 < 5){
            System.out.println("Var2 is less than 5");
        } else{
            System.out.println("Var2 isn't 5 silly :p");
        }
//you technically could just set var2 = 5 and then you'd be right
// but realistcally, not too practical

        int var3 = 5;   
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else if (var3 < 10) {
            System.out.println("Var3 is less than 10");
        } else {
            System.out.println("Var3 is 10...or you did something wrong"); 
        }


        //for this section: why are we not entering the if statement?
        String uni = "Marist";
        
        if (uni == "Marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }


    }
}
