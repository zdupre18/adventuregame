package adventure_game;
//* class character Creater  */
 abstract public class CharacterCreator {
    public static void main (String[] args) {
        //private String name;
        private int health;
        private int damage;
        private int mana; 
    int statPoints = 20;
    //System.out.println("Enter your character name");
    }
    
     //public CharacterCreator(String name, int health, int damage, int mana){
        this.name = name;
        this.health = health;
        //this.damage = damage;
        //this.mana = mana;
    //}
    
    while (statPoints>0){
        System.out.println(" You have " + statPoints + " stat points left.");
        //System.out.println("1. Spend 1 stat point to increase health(+10 points)");
        //System.out.println("2. Spent 1 stat point to increae damage (+1 points) ");
        //System.out.println("Enter your choice: ");
    //int choice = input();
    //if (choice == 1) {
        health += 10;
        //statPoints -= 1;
    //} else if(choice == 2){
       // damage += 1;
        ///statPoints -= 1;
    //} else if (choice ==3) {
        //mana += 3;
        //statPoints -= 1;
    //} else{
        System.out.print("oops! choice invalid. Pick again.");
    
   // }
}
System.out.print("Welcome!");
  //  }

    private static int input() {
        return 0;
    //}
}
}