public class Main
{
	public static void main(String[] args) {
		// FR, SO, JR, SR - because it's shorter and i didn't feel like typing sophmore...
		//other details are random by my own discretion
		student s1 = new student("Rodridgo", "SO", 3.73, 424);
		student s2 = new student("Taylin", "JR", 3.91, 683);
		student s3 = new student("Hoshi", "SR", 2.68, 777);
		student s4 = new student("Lang", "FR", 3.14, 94);
		student s5 = new student("Markus", "FR", 3.59, 102);
		
		//next step: figure out why it won't run the new students
		
	    //honor roll check
	    s1.HonorRoll();
	    s2.HonorRoll();
	    s3.HonorRoll();
	    s4.HonorRoll();
	    s5.HonorRoll();
	}
}
