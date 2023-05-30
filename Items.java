import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items extends Actor
{
    HealthPlayer healthPlayer;
    ManaBar manaBar;
    public void Items(HealthPlayer healthPlayer, ManaBar manaBar){
        this.healthPlayer = healthPlayer;
        this.manaBar = manaBar;
    }
    public void act()
    {
        // Add your action code here.
    }
}
