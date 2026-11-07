
public class Enemy {
    int health;
    int damage;

    public Enemy(int h, int d){
        health = h;
        damage = d;
    }

    void attack(){
        System.out.println("the enemy attacks");
        // fix later --> System.out.println("It deals " + d + "damage");

    }
}
