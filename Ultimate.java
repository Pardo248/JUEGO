import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ultimate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ultimate extends Attack
{
    int ULTIMATE_MANA_COST = 20;
    public void act()
    {
        if(Greenfoot.isKeyDown("r") && manaBar.getMana() >= ULTIMATE_MANA_COST && coolDown.getIsTime() == true){
            manaBar.LoseMana(ULTIMATE_MANA_COST);
            healthBoss.LoseHeart(player.getUltimateDamage());
            coolDown.Use();
        }
    }
}
