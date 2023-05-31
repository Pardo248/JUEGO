import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ManaPotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManaPotion extends Items
{
    private int manaGain = 10;
    public void act()
    {
        if(Greenfoot.isKeyDown("2")){
            manaBar.GainMana(manaGain);
        }
    }
}
