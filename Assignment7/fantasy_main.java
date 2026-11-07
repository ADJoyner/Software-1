public class fantasy_main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
Enemy diego = new Enemy(20,5);

System.out.println("Diego's Turn!");
diego.attack();
System.out.println(); //spacing returns

        //create a fire and an ice wizard and call all functions
Wizard Gilbert = new Wizard(12,6,"fire");
Wizard Callum = new Wizard(10,7,"ice");

Gilbert.damageType();
Callum.damageType();
System.out.println(); //spacing returns
        //create a goblin and call its functions

Goblin Mort = new Goblin(2, 50,"bingus");
Mort.attack();

    }
}
//1. i love and appreciate the fantasy vibes!
//2. hot damn this was easier than i was expecting it to be. 
// seeing it in a more specific context helped me grasp the usage of inheritance and how it works

//note for self: 
// would be cool to receive user input and have it return a specific function from a class (i.e attack, defend, item)
//and make a kind of combat/puzzle game where the player can pick from different options
//don't forget the while loop for it
