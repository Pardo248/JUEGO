import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObtainDamage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObtainDamage extends Actor
{
    private static final int COUNT_DOWN_MOUTH_START_VALUE = 4;
    private int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    public void act()
    {
        Return();
    }
    public void Damage(){
        setImage("images/Damage.png");
    }
    private void Return(){
        mouthDelay--;
        if(mouthDelay ==0){
            mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
            setImage("images/Transparente.png");
            
        }
        
    }
}
