public class Goblin extends Enemy{

    //Needs constructor
String type;
    public Goblin(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    //needs method to overwrite attack in enemy to say "the goblin gobbles" instead of "the enemy attacks

    @Override
    void attack(){
        System.out.println("the goblin gobbles >:P");
    }

}
