import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeartBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health;
    Boss1Ada boss;
    
    WIN losse = new WIN();
    
    public void HealthBar(Boss1Ada actualBoss){
        boss = actualBoss;
        health = boss.getHealth();
        
        setImage(new GreenfootImage(1003,12));
        getImage().drawRect(0,0,1002,11);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,10);
    }
    public void act()
    {
        setImage(new GreenfootImage(1003,12));
        getImage().drawRect(0,0,1002,11);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,1002,10);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,10);
    }
    public void LoseHeart(int damage){
        health = health - damage;
        if (health <= 0){
            LOSSE();
        }
    }
    public void LOSSE (){
        Greenfoot.setWorld(losse);
    }
}
