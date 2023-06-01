import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private final int BASIC_DAMAGE = 50;
    private final int MAGICAL_DAMAGE = 100;
    private final int ULT_DAMAGE = 200;
    private int health = 100;
    private int mana = 0;
    private int damage = 1;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public int getNormalDamage(){
        return BASIC_DAMAGE;
    }
    public int getMagicalDamage(){
        return MAGICAL_DAMAGE;
    }
    public int getUltimateDamage(){
        return ULT_DAMAGE;
    }
    public int getHealth(){
        return health;
    }
    public int getMana(){
        return mana;
    }
}
