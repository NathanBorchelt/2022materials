import java.util.Random;
import java.util.ArrayList;
public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        //three character all with random stats in order to show multiple results
        Warrior warrior = new Warrior("Kratos", 50+random.nextInt(101), 1+random.nextInt(20), 10+random.nextInt(16));
        Wizard wizard = new Wizard("Merlin", 50+random.nextInt(101), 1+random.nextInt(20), 10+random.nextInt(16));
        Archer archer = new Archer("Sterling", 50+random.nextInt(101), 1+random.nextInt(20), 10+random.nextInt(16));
        ArrayList<GameCharacter> activeFighters = new ArrayList<>();//an array for looping combat and potential for infinite combatants
        activeFighters.add(wizard);
        activeFighters.add(warrior);
        activeFighters.add(archer);
        int turn = 0;// a variable for indexing through all the combatants
        //a method of discribing the two side of an attack to avoid reference by indexing
        GameCharacter aggressor;
        GameCharacter victim;
        //a show of stats
        for(GameCharacter gC: activeFighters){
            System.out.println(gC);
        }
        while(activeFighters.size()>1){
            aggressor = activeFighters.get(turn%activeFighters.size());
            turn++;
            //have the index advance to set the victim now, and later the aggressor
            victim = activeFighters.get(turn%activeFighters.size());
            aggressor.fight(victim);
            //assuring only the living are fighting
            if(!victim.isAlive()){
                activeFighters.remove(victim);
            }
            if(!aggressor.isAlive()){
                activeFighters.remove(aggressor);
            }
        }
        //0 is the only one remaining in the ArrayList, assuring the correct output
        System.out.println(activeFighters.get(0).getName()+" won");
    }
}
