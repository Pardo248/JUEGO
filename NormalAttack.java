import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NormalAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NormalAttack extends Attack
{
    private int NORMAL_MANA_GAIN = 30;
    public void act()
    {
        if(Greenfoot.isKeyDown("e") && coolDown.getIsTime() == true){
            if(coolDown.getIsTime() == true){
             healthBoss.LoseHeart(player.getNormalDamage());
             manaBar.GainMana(NORMAL_MANA_GAIN);
             
             coolDown.Use();
             }
        }
    }
}
