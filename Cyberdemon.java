/**
 * Write a description of class Cyberdemon here.
 * 
 *@author Leslie Acevedo
 *@version 2024.11.11
 */
public class Cyberdemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CD_HP = 100;
    private static final int MIN_CD_HP = 25;
    private static final int MAX_CD_STR = 40;
    private static final int MIN_CD_STR = 20;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Cyberdemon()
    {
        super(
            Randomizer.nextInt(MAX_CD_HP-MIN_CD_HP)+MIN_CD_HP,    
            Randomizer.nextInt(MAX_CD_STR-MIN_CD_STR)+MIN_CD_STR
        );
          
    }
    @Override
    public int attack(){
        int damage = super.attack();
        System.out.println("Cyberdemon Attacks: "+ damage +" damage");
        return damage;
    } 
    

    
}
