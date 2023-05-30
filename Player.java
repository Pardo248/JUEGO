import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    static final int BasicDamage = 5;
    static final int MagicalDamage = 10;
    static final int Ultimate = 20;
    static int health = 100;
    static int mana = 0;
    static int damage = 1;
    static int armor = 1;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Player(Boss1Ada boss){
        //HeadBar head 
    }
    public void act()
    {
        
    }
    public int getNormalDamage(){
        return BasicDamage;
    }
    public int getMagicalDamage(){
        return MagicalDamage;
    }
    public int getUltimateDamage(){
        return Ultimate;
    }
    public int getHealth(){
        return health;
    }
    public int getMana(){
        return mana;
    }
}
