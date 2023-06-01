import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObtainDamage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObtainDamage extends Actor
{
    private static final int COUNT_START_VALUE = 4;
    private int count = COUNT_START_VALUE;
    public void act()
    {
        Return();
    }
    public void Damage(){
        setImage("images/Damage.png");
    }
    private void Return(){
        count--;
        if(count == 0){
            count = COUNT_START_VALUE;
            setImage("images/Transparente.png");
            
        }
        
    }
}
