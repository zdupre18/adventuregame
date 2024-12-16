package adventure_game.tests;
import adventure_game.Character;
import adventure_game.Player;
import adventure_game.items.HealingPotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class HealingPotionTests {
    private HealingPotion h;
        private Mana m;
        @BeforeEach
        void setup(){
            h = new Player("Hero", 100, 9, 7);
        }
    }

    @Test
    void testHealingPotion(){
       if(health >= maxHealth)
       break;
    }
}
