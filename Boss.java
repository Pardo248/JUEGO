import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health;
    int damage;
    static final int FAST = 30;
    static final int SLOW = 1;
    int bandera = 1;
    
    Boolean isAtack;
    
    protected static final int COUNT_START_VALUE = 50;
    protected int COUNT = COUNT_START_VALUE;
    
    protected static final int COUNT_DOWN_MOUTH_START_VALUE = 100;
    protected int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    public void Boss(){
        
    }
    
    public void act()
    {
        
    }
    
    public void Start(){
        if(getX() <= 600){
            setLocation(getX() + FAST, getY());
        }
    }
    public void Animation(){
        if(bandera == 1){
            setLocation(getX() , getY() + SLOW);
        }
        else{
           setLocation(getX() , getY() - SLOW); 
        }
        COUNT--;
        if(COUNT == 0){
            COUNT = COUNT_START_VALUE;
            bandera = bandera * -1;
        }

    }
    public Boolean getIsAtack (){
        return isAtack;
    }
    
}
