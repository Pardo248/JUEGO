import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeartBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    private int health;
    Enemy enemy;
    
    private int time = 0;
    private float score;
    
    public void HealthBar(Enemy enemy){
        this.enemy = enemy;
        health = enemy.getHealth();
        
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
        
        time++;
    }
    public void LoseHeart(int damage){
        health = health - damage;
        if (health <= 0){
            WIN();
        }
    }
    public void WIN(){
        score = 100000 / time;
        
        WIN win = new WIN(score);
        Greenfoot.setWorld(win);
    }
    public int getHealth(){
        return health;
    }
}
