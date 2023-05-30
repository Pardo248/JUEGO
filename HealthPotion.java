import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPotion extends Items
{
    int healGain = 10;
    public void act()
    {
        if(Greenfoot.isKeyDown("1")){
            healthPlayer.GainHealth(healGain);
        }
    }
}
