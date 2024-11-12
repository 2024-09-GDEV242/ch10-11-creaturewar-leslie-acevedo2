/**
 * Write a description of class Balrog here.
 *
 *@author Leslie Acevedo
 *@version 2024.11.11
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    public Balrog()
    {
        super(Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
            );
    }
    @Override
    public int attack(){
        int damage = 0;
        for(int i = 0; i<2; i++){
            System.out.println("Balrog attack: #" + (i + 1));
            damage+= super.attack();
        }
        System.out.println("Blorg Attacks: "+ damage +" damage");
        return damage;
    } 
}
