import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.HashMap;

import adventure_game.NPC;
import adventure_game.Player;
import adventure_game.items.Consumable;
//* class room estbalishes directional directions for the exits of all rooms in the game by using N S E W */
public class Room {
    public static void main(String[] args){
    ArrayList <Room> map;
    map = new ArrayList<Room>();
    }
    private int roomEast;
    private int roomNorth;
    private int roomWest;
    private int roomSouth;
    private String roomName;
    private String description;
    private String currentRoom;
    

    public Room(int roomEast, int roomNorth, int roomWest, int roomSouth, String roomName, String description) {
    this.roomEast = roomEast;
    this.roomNorth = roomNorth;
    this.roomWest = roomWest;
    this.roomSouth = roomSouth;
    this.roomName = roomName;
    this.description = description;
    }
}
//* @param getRoomEast gets the room and estblishes which room is the exit using the HASHMAP implemented in the program */
    public Object getRoomEast(){
        return getRoomEast();
    }
    //* @param setRoomEast sets the room as the east exit of the currentRoom */
    public Object setRoomEast(){
        return getRoomEast();
    }
    //* @param getRoomNorth gets the room and estblishes which room is the exit using the HASHMAP implemented in the program */
    public Object getRoomNorth(){
        return getRoomNorth();
    }
        //* @param setRoomNorth sets the room as the north exit of the currentRoom */
    public Object setRoomNorth(){
        return getRoomNorth();
    }
        //* @param getRoomWest gets the room and estblishes which room is the exit using the HASHMAP implemented in the program */
    public Object getRoomWest(){
        return getRoomWest();
    }
            //* @param setRoomWest sets the room as the west exit of the currentRoom */
    public Object setRoomWest(){
        return getRoomWest();
    }
            //* @param getRoomSouth gets the room and estblishes which room is the exit using the HASHMAP implemented in the program */
    public Object getRoomSouth(){
        return getRoomSouth();
    }
                //* @param setRoomSouth sets the room as the south exit of the currentRoom */
    public Object setRoomSouth(){
        return getRoomSouth();
    }
    //*@param getCurrentroom gets current room as we start in room 0 and sets them up so they can chose the exits  */
    public Object getCurrentRoom(){
        return getCurrentRoom();
    } 
    //* @param getRoom name gets the current room name and sets the name  */
    public Object getroomName(){
        return getroomName();
    }
    public Object setroomName(){
        return getroomName();
    }
    public Object getDescription(){
        return getDescription();
    }
    public Object setDescription(){
        return getDescription();
    } 
if( Room = -1){
    System.out.print("there is no exit here.");
}
//* setting the rooms with their exits */
map = new HashMap<Integer,Room>();
currentRoom = 0;
map.put(0).new Room(1,3,2,-1);
map.get(0).setName("Foyer");
map.get(0).setDescription("This is a spacious entryway. There is a portait of a young couple to the left. The man is wearing a sport's coat with a purple cravat and the woman a lab coat. To the right is a patinaed mirror.");
map.put(1).new Room(-1,-1,0,-1);
map.get(1).setName("Study");
map.get(1).setDescription("the bookshelves along the walls are disheveled and disorganized. There is a desk on the far wall with drawers open and papers scattered across it. The open chest next to it contains a single empty vial.");
map.put(2).new Room(0,-1,-1,-1);
map.get(2).setName("Den");
map.get(2).setDescription("There is a large sofa, two armchairs, and a large screen TV mounted on the wall. The TV has a large crack across it. There is a shattered vase, desicated plant matter, and a dry water stain below it. There are paintings of row boats and yachts on the walls.");
map.put(3).new Room(4,8,11,0);
map.get(3).setName("Grand Ballroom");
map.get(3).setDescription("There are small tables with tall stools around a dance floor. There is a raised stage in the back right. The floor and stage are made of glass and below it you see rolling water. The ballroom is dark, only illuminated by the scattered light reflecting off the waves below.");
map.put(4).new Room(4,8,11,0);
map.get(4).setName("East Wing Hallway");
map.get(4).setDescription("This is a carpeted hallway. There is a stain which has burned through the carpet in front of the north door. At the end of the hallway is statue-like atomic model of what looks like a biological macro-molecule. The plaque says, GP429-TS03.pdb - The key to emergent consciousness");
map.put(5).new Room(-1,-1,-1,4);
map.get(5).setName("Laboratory");
map.get(5).setDescription("This room stands in stark contrast to the hallway outside. Its floors are white tiles, walls are are smooth white plastic. It is illuminated by the flashing and flickering of computer monitors hanging from the ceiling askew on their mounting supports. Between the flickering, on one, there is scrolling text, atoms and coordinates. On another, a model of GP429-TS03, shifting, morphing, and... growing? On the left wall is a workbench with a shattered ventilation hood, fan sputtering.");
map.put(6).new Room(7,4,-1,-1);
map.get(6).setName("Master Bedroom");
map.get(6).setDescription("This room is in perfect order. There is a four posted bed, made, covered in throws and pillows. There is a reading chair in the corner with The Confessions of Arsene Lupin open on a stand next to it.")
map.put(7),new Room(-1,-1,6,-1);
map.get(7).setName("Master Bathroom");
map.get(7).setDescription("The walk-in shower is luxurious. The double vanity is topped with creams, perfumes, lotions, oils, and a box of sheet masks. There is a damp towel hanging on a hook.");
map.put(8).new Room(9,-1,-1,3);
map.get(8).setName("Dining Room");
map.get(8).setDescription("There is a large black aluminum and glass table in the center surrounded by molded black shell chairs. The back wall is a window through which you see waves and rolling fog. The mast of a sailboat protrudes from the waves.");
map.put(9).new Room(-1,10,8,-1);
map.get(9).setName("Kitchen");
map.get(9).setDescription("The kitchen is spacious and luxurious. There are two oversized fridges with transparent doors. The food is fresh. On the island is an open tin of kerosene. On the floor is a mop handle. The mop head is burnt to ash.");
map.put(10).new Room(-1,-1,-1,9);
map.get(10).setName("Pantry");
map.get(19).setDescription("The walls are lined with shelves. Bulk goods are organized into containers. There is an airtight container filled with dog food. Everything is in order except for the shelf with cleaning agents and household liquids. These are knocked aside and there is a gap in the middle.");
map.put(11).new Room(3,13,15,12);
map.get(11).setName("West Wing Hallway");
map.get(11).setDescription("This is a carpeted hallway. On a side table is a bust of a woman. The paque says Ada Lovelace - Let your vision become reality.");
map.put(12).new Room(-1,11,-1,-1);
map.get(12).setName("General Storage Room");
map.get(11).setDescription("The room is packed with tables, chairs, and paintings. There are three cracked mirrors, a box of old keyboards and cables, and an PDP 11 pushed into the corner.");
map.put(13).new Room(-1,14,-1,11);
map.get(13).setName("Antechamber");
map.get(13).setDescription("This room looks like a quest room except that it is nearly empty except for cobwebs stretching from the chandelier, single crystal clear standing mirror in the corner, and an empty bookcase standing ajar against the back wall.");
map.put(14).new Room(-1,-1,-1,13);
map.get(14).setName("Beautiful Bedroom");
map.get(14).setDescription("This room is beautifully appointed. There is a rosewood desk with a closed laptop on top of it. Against the wall is a bookcase containing Meditations by Marcus Aurelius, a yellowed PDP-11 user manual, the Complete Sherlock Holmes, and The C Programming Language by Kernighan and Ritchie. An ivy vine frames the window and doorframe. On the bed lays a man with a purple cravat and an IV embedded in his arm.");
map.put(15).new Room(11,-1,-1,-1);
map.get(14).setName("Water Closet");
map.get(14).setDescription("his guest bathroom is simple but functional. There is a shower, a razor on the counter, and a strop hangin on the wall.");
//* @param movePlayer moves player from current room into desired exit. if no exit is found( -1) null is returned  */
private void movePlayer(int newpos){
    if(newpos == -1){
        System.out.println("there is no exit");
    }else{
        Player.Room = map[newpos];
        System.out.println("You are in position" + currentRoom);
    }
}
//*sets random # of oppenets throughout the map  */
Random opponent = new Random();
private boolean opponentInRoom = true; 
if(opponentInRoom){
    System.out.println("Spotted! oppoent is in room choose attack or defend");
}else{
    System.out.println("there is no opponent. chose where you want to go next.");
}
//* checks to see if opponent is defeated or if yoy still have to attack/defend */
boolean oppoentDefeated = false;
System.out.print("Opponent is not defeated. Attack or defend. ");         
if(Player.health == 0){
    System.out.println "you lost."
}
//* @param take item takes item of port key when you have defeated all enemies  */
public void getPortKey(int takeItem){
         ArrayList<Room> item;
         item.get(takeItem);
        System.out.println("Congrats! you defeated the opponents and successfully grabbed the Port Key!");
} 


//need to estbalish the rooms
//figure out how to use a hashmap
//figure out how to relate the numbers and the rooms
//figure out how to randomize 

///find examples online to look 
///For every turn of the game, the player is presented with a description of the room they are in along with where its exits are. The player then chooses which exit to go through to enter a new room. If the player enters a room with an opponent in it, before anything else happens, they enter combat with that opponent. If they defeat the opponent, they get any items present in the room. If the room contains the portkey, they win.

