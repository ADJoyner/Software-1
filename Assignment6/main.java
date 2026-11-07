public class main {
public static void main(String[] args) {
		// FR, SO, JR, SR - because it's shorter and i didn't feel like typing sophmore...
		//other details are random by my own discretion
		/* 
        student s1 = new student("Rodridgo", "SO", 3.73, 424);
		student s2 = new student("Taylin", "JR", 3.91, 683);
		student s3 = new student("Hoshi", "SR", 2.68, 777);
		student s4 = new student("Lang", "FR", 3.14, 94);
		student s5 = new student("Markus", "FR", 3.59, 102);
        */
        student s1 = new student("Rodridgo", "SO", 3.73, 3);
		student s2 = new student("Taylin", "JR", 3.91, 2);
		student s3 = new student("Hoshi", "SR", 2.68, 1);
		student s4 = new student("Lang", "FR", 3.14, 5);
		student s5 = new student("Markus", "FR", 3.59, 4);
		
    //check to see that it's working:
    //int randomNum2 = (int)(Math.random() * (6-1)+1);
    //System.out.println(randomNum2);
		

    // 
	    //honor roll check
	    s1.HonorRoll();
	    s2.HonorRoll();
	    s3.HonorRoll();
	    s4.HonorRoll();
	    s5.HonorRoll();
       System.out.print("\n");
int randomNum2 = (int)(Math.random() * (6-1)+1);

       //free lunch time
       s1.FreeLunch2(randomNum2);
       s2.FreeLunch2(randomNum2);
       s3.FreeLunch2(randomNum2);
       s4.FreeLunch2(randomNum2);
       s5.FreeLunch2(randomNum2);
//
}

/* 
What I learned:
I learned how to get random numbers and cemented how to use non-void methods w/ classes :D
also made me realize that functions still mostly the same. it's not as scary as it seems

*/
}
