/**
 * Write a description of class Simulation here.
 *
 * @author Leslie Acevedo
 * @version 2024.11.11
 */
import java.util.ArrayList;
import java.util.Collections;

public class Simulation
{
    ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    ArrayList<Creature> evilArmy = new ArrayList<Creature>();
    public Simulation() {
	createGood();
	createEvil();
	System.out.println("Created the armies!");
	System.out.println("Good Army Size: " +  goodArmy.size());
    	System.out.println("Evil Army Size: " +  evilArmy.size());
    }
    // setting condition for finishing the war
    private boolean checkBattleOver() {
	boolean battleOver = false;
	if (this.goodArmy.size() <= 0 || this.evilArmy.size() <= 0) {
            battleOver = true;
	}
            return battleOver;
    }
	
    // the combat between two armies
    public void war() {	
        if(goodArmy.isEmpty() || evilArmy.isEmpty()){
            goodArmy = new ArrayList<Creature>();
            evilArmy = new ArrayList<Creature>();
            createGood();
            createEvil();
            System.out.println("Created the armies!");
            System.out.println("Good Army Size: " +  goodArmy.size());
    	    System.out.println("Evil Army Size: " +  evilArmy.size());
        }
    	boolean battleOver = false;
	while (!battleOver) {				
            			
            Creature goodCreature = this.goodArmy.get(0);
            Creature badCreature = this.evilArmy.get(0);
            
            do {	
                goodCreature.takeDamage(badCreature.attack());
                badCreature.takeDamage(goodCreature.attack());
            } while (goodCreature.isAlive() && badCreature.isAlive());
            System.out.println("Creatue died!");
            System.out.println("Good Creature Health: " + goodCreature.getHealth());
            System.out.println("Evil Creature Health: " + badCreature.getHealth());

            if (goodCreature.isKnockedOut()) {
                this.goodArmy.remove(goodCreature);
                System.out.println("Removing good creature from battlefield!");
            }
            if (badCreature.isKnockedOut()) {
                this.evilArmy.remove(badCreature);
                System.out.println("Removing evil creature from battlefield!");
            }
                System.out.println("\n");

                battleOver = checkBattleOver();
        }	
                System.out.println("Good Army Remaining Size: " +  goodArmy.size());
        	System.out.println("Evil Army Remaining Size: " +  evilArmy.size());
        	 // declare the winner
            if (this.goodArmy.size() <= 0) {
        	System.out.println("Warriors lost to Demons...");
            } else {
                System.out.println("Warriors defeated Demons and won the combat...");
            }
        }
    
    //Populate the good army with creatures    
    public void createGood(){
        for(int i  = 0; i < 100; i++){
            int value = Randomizer.nextInt(10-1)+1;
            if(value >= 1 && value <= 6){
                goodArmy.add(new Human());
            }else{
                goodArmy.add(new Elf());
            }
        }
        System.out.println("Created good army!");
    }
    
    //Populate the bad army with creatures    
    public void createEvil(){
        for(int i  = 0; i < 100; i++){
            int value = Randomizer.nextInt(25-1)+1;
            if(value >= 1 && value <= 18){
                evilArmy.add(new Human());
            }else if(value >= 19 && value <= 24){
                evilArmy.add(new Cyberdemon());
            }else{
                evilArmy.add(new Balrog());
            }
        }
        System.out.println("Created bad army!");

    }
}
