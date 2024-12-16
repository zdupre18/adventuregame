package adventure_game;

/*
 * Project-01: Adventure Game
 * Name: Zoë Dupre 721002552
 */

import java.util.Scanner;

import adventure_game.items.HealingPotion;
//* Game  */
import java.util.Random;
public class Game {
    static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();
    private Player player;
    
    public static void main(String[] args){

        Game game = new Game();

        game.createPlayer();
        System.out.println(game.player.toString());

        NPC opponent = new NPC("Geoff", 200, 0, 10);
        System.out.println(opponent.toString());
        game.enterCombat(opponent);

        in.close();
    }

    public Game() {
        
    }
/**allows user to creat their player and decide the descritpion for health mana and base damage 
 */
    public void createPlayer(){
        /* TO-DO */
        /* Modify this method to allow the user to create their own player */
        /* The user will specify the player's name and description, and spend */
        /* 20 points on health, mana, and baseDamage as they see fit. */
        player = new Player("The Hero", 100, 9, 7);
        player.obtain(new HealingPotion());
    }
/** sets up combat between opponent and player 
 * @param opponent the npc opponent fighting against player  
 */
    public void enterCombat(NPC opponent){
        System.out.printf("%s and %s are in a brawl to the bitter end.\n", this.player.getName(), opponent.getName());
        while(true){
            //takes turn 
            this.player.takeTurn(opponent);
            if(!opponent.isAlive()){
                //if opponent loses game ends 
                System.out.printf("%S is SLAIN!!\n",opponent.getName());
                break;
            }

            opponent.takeTurn(this.player);
            if(!this.player.isAlive()){
                System.out.printf("%S is SLAIN!!\n",this.player.getName());
                break;
            }
        }
    }
}
