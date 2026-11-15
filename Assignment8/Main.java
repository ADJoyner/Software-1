/* DATA STRUCTUUURES
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        
    //Q1 & Q2
    int max = 0;
    int min = 999;
    int count = 0;


    for (int val = 0; val < 8; val++){
        if (stax.peek() > max) {
            max = stax.peek();
            System.out.println("new max");
            stax.pop();
            count++;
        } else if (stax.peek() < min){
           min = stax.peek(); 
           System.out.println("new min");
           stax.pop();
           count++;
            
        } else {
            System.out.println("in-between");
            stax.pop();
            count++;
        }

}
System.out.println("Max Value: " + max);
System.out.println("Min Value: " + min);
// yes i just added a counter to each option for Q2. trying to keep this simple
System.out.println("There were " + count + " elements in the stack");


/////

        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

//Q3 - idk if you literally meant just return the middle most value of the list or to like find the avg by adding them all up and /5 yknow
//please let me know if i took the question the wrong way
System.out.println(linky.get(2));


//Q4
//concert venue
Queue<Integer> q = new LinkedList<>(); 
System.out.println("Game loading...assigning player IDs");
q.add(1);
q.add(2);
q.add(3);
q.add(4);


System.out.println("Next ID: " + q.peek());
System.out.println("Player: Gamer68_id-"+ q.poll());
//thank you geeksforgeeks.org to help me find out that poll() returns the top element and removes it at the same time :D
System.out.println("Next ID: " + q.peek());
System.out.println("Player: NinjaSlayer_id-"+ q.poll());
System.out.println("Next ID: " + q.peek());
System.out.println("Player: xXSuper_SteveXx_id-"+ q.poll());
System.out.println("Next ID: " + q.peek());
System.out.println("Player: ProgramminPaul_id-"+ q.poll());
System.out.println("Next ID: " + q.peek());
System.out.println("No more players in queue...");

    }
}

