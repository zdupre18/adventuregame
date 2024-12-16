package adventure_game.items;
import adventure_game.Character;
import adventure_game.NPC;

public abstract class Mana implements Consumable {
    public static void main(String[] args){

        /**   creates a healing potion and replaces up to 4 health to overal health score and takes away turn
         * @param castSpell Casting a spell costs 3 mana and reduces the opponent's health by half.
         */
        int mana;
        String name;
        int damage;
        int health; 
        int mana;
        public void castSpell(NPC opponent) {
            if(mana >= 3){ 
                int damage = opponent.getHealth() /2;
                opponent.modifyHealth(-damage);
                this.modifyMana(-3);
                System.out.printf(name + " casts a spell and deals " + damage + "damage to " + opponent);
            }
            if(mana <= 0) {
                System.out.printf("Not enough mana available.");
                }
            
        
            ////public void modifyMana(int modifier) {
                this.mana += modifier;
                if(this.mana <=0 ){
                    this.health = 0;
                }
                if(this.health > this.getMaxHealth()){
                    this.health = this.getMaxHealth();
                }
            }
        private int getMaxHealth() {
                return 0;
            }
        /** modifier charge Charging up mana increments the Player's mana by 1.  */
        public void chargeMana() {
            this.modifyMana(1);
            System.out.print(name + " charges up mana and now has " + mana + " mana.");
        }
        @Override
        public void consume(Character owner) {
            throw new UnsupportedOperationException("Unimplemented method 'consume'");
        }
		
}

}

