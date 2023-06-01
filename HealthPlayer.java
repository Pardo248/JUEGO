import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPlayer extends Actor
{
    int health;
    Player player;
    
    int time = 0;
    float score;
    
    public void HealthPlayer(Player actualPlayer){
        
        player = actualPlayer;
        
        health = player.getHealth();
        
        setImage(new GreenfootImage(100,30));
        getImage().drawRect(0,0,98,29);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,28);
    }
    public void act()
    {
        setImage(new GreenfootImage(100,30));
        getImage().drawRect(0,0,98,29);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,99,28);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,28);
        
        time++;
    }
    public void LoseHeart(int damage){
        health = health - damage;
        if (health <= 0){
            LOSSE();
        }
    }
    public void GainHealth(int healthGain){
        health = health + healthGain;
    }
    public void LOSSE (){
        
        score = time / 1000;
        
        LOSE losse = new LOSE(score);
        
        Greenfoot.setWorld(losse);
    }
}

