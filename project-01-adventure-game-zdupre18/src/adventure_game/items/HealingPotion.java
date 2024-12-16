package adventure_game.items;

import adventure_game.Character;
import adventure_game.Game;
/** Healing Potion  */
public class HealingPotion implements Consumable {
    /**   creates a healing potion and replaces up to 4 health to overal health score and takes away turn
     * @param owner creates owner of character with that item to use 
     */
    public void consume(Character owner){
        int hitPoints = calculateHealing();
        int hitPointsFromMax = owner.getMaxHealth() - owner.getHealth();

        if(hitPoints > hitPointsFromMax){
            hitPoints = hitPointsFromMax;
        }
        System.out.printf("You heal for %d points, back up to %d/%d.\n", hitPoints, owner.getHealth(), owner.getMaxHealth());
        owner.modifyHealth(hitPoints);
    }

    private int calculateHealing(){
        // Equivalent to rolling 4d4 + 4
        // sum up four random values in the range [1,4] and
        // add 4 to that.
        int points = Game.rand.nextInt(4)+1;
        points += Game.rand.nextInt(4)+1;
        points += Game.rand.nextInt(4)+1;
        points += Game.rand.nextInt(4)+1;
        return points + 4;
    }
}
