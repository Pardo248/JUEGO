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
    protected int cantidad;
    protected final int TIME_START_VALUE = 50;
    protected int time = TIME_START_VALUE;
    
    public void Items(HealthPlayer healthPlayer, ManaBar manaBar, int cantidad){
        this.healthPlayer = healthPlayer;
        this.manaBar = manaBar;
        this.cantidad = cantidad;
    }
    public void act()
    {
        // Add your action code here.
    }
}
