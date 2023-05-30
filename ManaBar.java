import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ManaBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManaBar extends Actor
{
    int mana;
    Player player;
    public void ManaBar(Player actualPlayer){
        player = actualPlayer;
        
        mana = player.getMana();
        
        setImage(new GreenfootImage(100,12));
        getImage().drawRect(0,0,98,11);
        getImage().setColor(Color.BLUE);
        getImage().fillRect(1,1,100,10);
    }
    public void act()
    {
        setImage(new GreenfootImage(100,12));
        getImage().drawRect(0,0,98,11);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(1,1,99,10);
        getImage().setColor(Color.BLUE);
        getImage().fillRect(1,1,mana,10);
    }
    public void LoseMana(int damage){
        mana = mana - damage;
    }
    public void GainMana(int manaGain){
        mana = mana + manaGain;
    }
    public int getMana(){
        return mana;
    }
}
