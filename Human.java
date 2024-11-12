/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Leslie Acevedo
 * @version 2024.11.11
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 30;
    private static final int MIN_HUMAN_HP = 10;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Human()
    {
        super(
            Randomizer.nextInt(MAX_HUMAN_HP-MIN_HUMAN_HP)+MIN_HUMAN_HP,    
            Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR
        );
          
    }
    
    @Override
    public int attack(){
        int damage = super.attack();
        System.out.println("Human Attacks: "+ damage +" damage");
        return damage;
    } 
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

    
}
