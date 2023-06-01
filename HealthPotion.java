import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPotion extends Items
{
    private final int HEALTH_GAIN = 50;
    public void act()
    {
        if(time != 0)
        {
            time--;
        }else
        {
           if(Greenfoot.isKeyDown("1") && cantidad > 0){
            time = TIME_START_VALUE;
            cantidad--;
            healthPlayer.GainHealth(HEALTH_GAIN);
        }
        }
        
        World world = getWorld();
        world.showText(""+ cantidad,1170,250);
    }
}
