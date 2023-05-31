import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MagicAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicAttack extends Attack
{
    private int MAGIC_MANA_COST = 10;

    public void act()
    {
        if(Greenfoot.isKeyDown("q")){
            if(manaBar.getMana() > MAGIC_MANA_COST && coolDown.getIsTime() == true){
            manaBar.LoseMana(MAGIC_MANA_COST);
            healthBoss.LoseHeart(player.getMagicalDamage());
            coolDown.Use();
        }
        }
    }
}
