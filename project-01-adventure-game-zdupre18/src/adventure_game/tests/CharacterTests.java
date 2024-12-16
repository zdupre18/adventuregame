package adventure_game.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import adventure_game.Character;
import adventure_game.Player;

public class CharacterTests{

    private Character c;
    @BeforeEach
    void setup(){
        c = new Player("Hero", 100, 9, 7);
    }

    @Test
     void testModifyHealth(){
        assertTrue(c.getHealth() == 100);
        c.modifyHealth(-10);
        assertTrue(c.getHealth() == 90);
    }

    @Test 
    void testCheckmaxHealth () {
        assertTrue(c.getMaxHealth() == 100);
        if (c.getMaxHealth() > 100){
            //break;
        }
    }
    @Test 
    void testStringtoString() {
        if(String.toString.isEmpty()) {
            System.out.println("Enter Name");
        break;
        }
    }

    @Test 
    void testAttack(){
        if(health <=0 ){
            break;
    }
    @Test 
    void tstDefend(){
    
        if(opponent.health <=0){
        break; 
        }
    }
}
