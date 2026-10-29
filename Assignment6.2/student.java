public class student{
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
       System.out.println(this.name + "You are eligible for Honor Roll");
   } else {
       System.out.println("You are NOT eligible for Honor Roll");
   }
    
}
 //new method
}
