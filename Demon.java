public class Demon extends Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;

    /**
     * Constructor for objects of class DEMON
     */
    public Demon(int str, int hp)
    {
        super(str,hp);      
    }
    
    // 5% chance to deal 50 hit points damage
    @Override
    public int attack(){
        int damage = super.attack();
        if(Math.random() < 0.05){
            damage+=50;
            System.out.println("Demon Buff: +50 Damage Activated!("+ (damage - 50) + "->" + (damage) + ")");
            return damage;
        }
        return damage;       
    }
}