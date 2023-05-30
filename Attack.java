import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Actor
{
    HealthBar healthBoss;
    Player player;
    ManaBar manaBar;
    CoolDown coolDown;
    public void Attack (HealthBar healthBoss, Player player, ManaBar manaBar, CoolDown coolDown){
        this.player = player;
        this.healthBoss = healthBoss;
        this.manaBar = manaBar;
        this.coolDown = coolDown;
    }
    public void act()
    {
        // Add your action code here.
    }
}
