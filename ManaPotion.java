import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ManaPotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManaPotion extends Items
{
    private final int MANA_GAIN = 50;
    public void act()
    {
        if(time != 0)
        {
            time--;
        }else
        {
            if(Greenfoot.isKeyDown("2") && cantidad > 0 ){
            time = TIME_START_VALUE;
            cantidad--;
            manaBar.GainMana(MANA_GAIN);
        }
        }
        
        World world = getWorld();
        world.showText(""+ cantidad,1170,170);
    }
}
