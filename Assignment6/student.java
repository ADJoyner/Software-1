public class student {
String name;
 String year;
 double gpa;
 int id;
 
 public student(String n, String y, double g, int i){
 name = n;
 year = y;
 gpa = g;
 id = i;
 }

 //new method
void HonorRoll(){
   if (this.gpa > 3.6) {
       System.out.println(this.name + " is eligible for Honor Roll");
   } else {
       System.out.println(this.name + " is NOT eligible for Honor Roll");
   }
    
}
 //new method
  
int FreeLunch(){ //idk how to "generate" an id so let's see how that goes
//pulled this from online and just adjusted the formulas as needed
int randomNum = (int)(Math.random() * (999 - 1)); // 

//System.out.println(randomNum); //check for self

if (randomNum == this.id){
    System.out.println("Yayyyy free lunch for you!");
} else {
    System.out.println("cough up dat moneeeey");
}
return randomNum;

}

//tried it again but just limited the range and actual student ids for the sake of testing
public int FreeLunch2(int randomNum2){
//int randomNum2 = (int)(Math.random() * (6-1)+1);
//fahhh i just checked and it's generating a new number each usage
//time to try a for loop
// nvm, lets use parameters then --> YAYYY

if (this.id == randomNum2){
        System.out.println("Yayyyy free lunch for you!");
    } else {
        System.out.println("cough up dat moneeeey");
    }

return randomNum2;

}
}



