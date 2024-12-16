package adventure_game;
import java.util.Random;
/**extends Character class and establishes NPC*/
 
public class NPC extends Character{

    public NPC(String name, int health, int mana, int baseDamage){
        super(name, health, mana, baseDamage);
    }
    /** take turn if Character gets Stunned 
     *  statement saying are unable to take their turn 
    */
    @Override
    public void takeTurn(Character other){
        if(this.isStunned()){
            this.decreaseTurnsStunned();
            System.out.printf("%S is unable to take any actions this turn!", this.getName());
            return;
        }
        this.attack(other);
    }
    public void Random(NPC other){
      Random opponent = new Random();
        if(opponent != null){
            //figure out how to implement the random 
            ///player.attack
        }


    }
}
