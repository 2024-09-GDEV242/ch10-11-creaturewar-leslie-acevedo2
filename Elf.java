
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    
    public Elf(){
        super(Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
            );
    }
    
    @Override
    public int attack(){
        int damage = super.attack();
        if(Math.random() < 0.1){
            System.out.println("Elf Buff: x2 Damage Activated!("+ damage + "->" + (damage * 2) + ")");
            return damage * 2;
        }
        System.out.println("Elf Attacks: "+ damage +" damage");
        return damage;
    } 
}
